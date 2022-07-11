@ECHO OFF

REM ** WARNING ** THIS FILE WILL BE OVERWRITTEN WHEN RE-INSTALLING PROXY SNIFFER

REM -------------------------------------------------------------------------------------------
REM Description: execute the same test three times with 5, 10 and 20 users. 
REM Generate a PDF summary report
REM -------------------------------------------------------------------------------------------

PATH=C:\Users\John\ZebraTester\jre\bin;%PATH%
SET CLASSPATH=.;C:\Users\John\ZebraTester\prxsniff.jar;C:\Users\John\ZebraTester\iaik_jce_full.jar;C:\Users\John\ZebraTester\iaikPkcs11Provider.jar;C:\Users\John\ZebraTester

SET EXECAGENT_NAME=Local Exec Agent
SET LOAD_TEST_PROGRAM=C:\Users\John\ZebraTester\MyTests\Test01.zip

REM -- clear first Web Admin result cache --
java PdfReport clear

SET LOOP_COUNTER=0
SET USERS=1
REM -- loop over serveral load tests --
:TEST_LOOP

	SET/A LOOP_COUNTER=%LOOP_COUNTER% + 1
	IF %LOOP_COUNTER% EQU 1 SET USERS=5
	IF %LOOP_COUNTER% EQU 2 SET USERS=10
	IF %LOOP_COUNTER% EQU 3 SET USERS=20
	IF %LOOP_COUNTER% EQU 4 GOTO TEST_END

	REM -- transmit job --
	java PrxJob transmitJob "%EXECAGENT_NAME%" "%LOAD_TEST_PROGRAM%" -u %USERS% -d 30 -t 60 -nolog -annotation "test run with %USERS% user"
	SET JOB_ID=%ERRORLEVEL%
	IF %JOB_ID% LSS 0 (
	  ECHO Error %JOB_ID%: unable to define job
	  GOTO ABORT_END
	)
	ECHO job %JOB_ID% transmitted


	REM -- start job --
	java PrxJob startJob "%EXECAGENT_NAME%" %JOB_ID%
	SET STATUS=%ERRORLEVEL%
	IF %STATUS% NEQ 0 (
	  ECHO Error %STATUS%: unable to start job %JOB_ID%
	  GOTO ABORT_END
	)
	ECHO job %JOB_ID% started on %EXECAGENT_NAME% - %USERS% user


	REM -- wait for job completion --
	java PrxJob waitForJobCompletion "%EXECAGENT_NAME%" %JOB_ID%
	SET STATUS=%ERRORLEVEL%
	IF %STATUS% NEQ 0 (
	  ECHO Error %STATUS%: unable to wait for job %JOB_ID%
	  GOTO ABORT_END
	)
	ECHO job %JOB_ID% completed


	REM -- acquire job result file --
	java PrxJob acquireJobResultFile "%EXECAGENT_NAME%" %JOB_ID% "C:\Users\John\ZebraTester\MyTests\test01_%USERS%u.prxres"
	SET STATUS=%ERRORLEVEL%
	IF %STATUS% NEQ 0 (
	  ECHO Error %STATUS%: unable to acquire job %JOB_ID% result file
	  GOTO ABORT_END
	)
	ECHO job %JOB_ID% result file acquired


	REM -- add result to PDF report ---
	java PdfReport load "C:\Users\John\ZebraTester\MyTests\Test01_%USERS%u.prxres"
        

	GOTO TEST_LOOP
	
:TEST_END

REM -- generate PDF load curves report --
java PdfReport generateLoadCurvesReport "C:\Users\John\ZebraTester\MyTests\Test01_Summary.pdf"
ECHO PDF load curves report created


ECHO test successful done
EXIT /B 0
	
	
:ABORT_END 
ECHO test failed
EXIT /B -1	
