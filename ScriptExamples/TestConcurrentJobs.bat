@ECHO OFF

REM ** WARNING ** THIS FILE WILL BE OVERWRITTEN WHEN RE-INSTALLING PROXY SNIFFER

REM -------------------------------------------------------------------------------------------
REM Description: start two jobs simultaneous and wait until both jobs are completed.
REM Generate two PDF detail reports
REM -------------------------------------------------------------------------------------------

PATH=C:\Users\John\ZebraTester\jre\bin;%PATH%
SET CLASSPATH=.;C:\Users\John\ZebraTester\prxsniff.jar;C:\Users\John\ZebraTester\iaik_jce_full.jar;C:\Users\John\ZebraTester\iaikPkcs11Provider.jar;C:\Users\John\ZebraTester

SET EXECAGENT_NAME=Local Exec Agent

SET TEST_PROGRAM_1=C:\Users\John\ZebraTester\MyTests\Test01.zip
SET TEST_ARGUMENTS_1=-u 1 -d 30 -t 60 -nolog -annotation "concurrent test 1"

SET TEST_PROGRAM_2=C:\Users\John\ZebraTester\MyTests\Test02.class
SET TEST_ARGUMENTS_2=-u 2 -d 30 -t 60 -nolog -annotation "concurrent test 2"

SET RESULT_FILE_1=C:\Users\John\ZebraTester\MyTests\Test01.prxres
SET RESULT_FILE_2=C:\Users\John\ZebraTester\MyTests\Test02.prxres
SET REPORT_FILE_1=C:\Users\John\ZebraTester\MyTests\Test01.pdf
SET REPORT_FILE_2=C:\Users\John\ZebraTester\MyTests\Test02.pdf


REM -- transmit job 1 --
java PrxJob transmitJob "%EXECAGENT_NAME%" "%TEST_PROGRAM_1%" %TEST_ARGUMENTS_1%
SET JOB_ID_1=%ERRORLEVEL%
IF %JOB_ID_1% LSS 0 (
  ECHO Error %JOB_ID_1%: unable to define job 1
  GOTO ABORT_END
)
ECHO job %JOB_ID_1% transmitted


REM -- transmit job 2 --
java PrxJob transmitJob "%EXECAGENT_NAME%" "%TEST_PROGRAM_2%" %TEST_ARGUMENTS_2%
SET JOB_ID_2=%ERRORLEVEL%
IF %JOB_ID_2% LSS 0 (
  ECHO Error %JOB_ID_2%: unable to define job 2
  GOTO ABORT_END
)
ECHO job %JOB_ID_2% transmitted


REM -- start job 1 --
java PrxJob startJob "%EXECAGENT_NAME%" %JOB_ID_1%
SET STATUS=%ERRORLEVEL%
IF %STATUS% NEQ 0 (
  ECHO Error %STATUS%: unable to start job %JOB_ID_1%
  GOTO ABORT_END
)
ECHO job %JOB_ID_1% started on %EXECAGENT_NAME%


REM -- start job 2 --
java PrxJob startJob "%EXECAGENT_NAME%" %JOB_ID_2%
SET STATUS=%ERRORLEVEL%
IF %STATUS% NEQ 0 (
  ECHO Error %STATUS%: unable to start job %JOB_ID_2%
  GOTO ABORT_END
)
ECHO job %JOB_ID_2% started on %EXECAGENT_NAME%


REM -- wait until job 1 and 2 are completed --
java PrxJob waitForJobCompletion "%EXECAGENT_NAME%" %JOB_ID_1% %JOB_ID_2%
SET STATUS=%ERRORLEVEL%
IF %STATUS% NEQ 0 (
  ECHO Error %STATUS%: unable to wait for job 1 and 2 completion
  GOTO ABORT_END
)
ECHO job %JOB_ID_1% and %JOB_ID_2% completed


REM -- acquire job 1 result file and generate PDF detail report --
java PrxJob acquireJobResultFile "%EXECAGENT_NAME%" %JOB_ID_1% "%RESULT_FILE_1%"
SET STATUS=%ERRORLEVEL%
IF %STATUS% NEQ 0 (
  ECHO Error %STATUS%: unable to acquire job %JOB_ID_1% result file
  GOTO ABORT_END
)
java PdfReport clear
java PdfReport loadWithDetailReport "%RESULT_FILE_1%" -output "%REPORT_FILE_1%"


REM -- acquire job 2 result file and generate PDF detail report --
java PrxJob acquireJobResultFile "%EXECAGENT_NAME%" %JOB_ID_2% "%RESULT_FILE_2%"
SET STATUS=%ERRORLEVEL%
IF %STATUS% NEQ 0 (
  ECHO Error %STATUS%: unable to acquire job %JOB_ID_2% result file
  GOTO ABORT_END
)
java PdfReport loadWithDetailReport "%RESULT_FILE_2%" -output "%REPORT_FILE_2%"


ECHO PDF detail reports created
ECHO jobs successful done
EXIT /B 0


:ABORT_END 
ECHO jobs failed
EXIT /B -1
