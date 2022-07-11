@ECHO OFF

REM ** WARNING ** THIS FILE WILL BE OVERWRITTEN WHEN RE-INSTALLING PROXY SNIFFER 

REM -------------------------------------------------------------------------------------------
REM Description: start a cluster job and wait for job completion. Generate a PDF detail report
REM -------------------------------------------------------------------------------------------

PATH=C:\Users\John\ZebraTester\jre\bin;%PATH%
SET CLASSPATH=.;C:\Users\John\ZebraTester\prxsniff.jar;C:\Users\John\ZebraTester\iaik_jce_full.jar;C:\Users\John\ZebraTester\iaikPkcs11Provider.jar;C:\Users\John\ZebraTester

SET CLUSTER_NAME=Cluster 1

SET LOAD_TEST_PROGRAM=C:\Users\John\ZebraTester\MyTests\Test01.zip
SET LOAD_TEST_ARGUMENTS=-u 3 -d 180 -t 60 -nolog -annotation "first cluster test run"
SET RESULT_FILE=C:\Users\John\ZebraTester\MyTests\Test01Cluster.prxres
SET REPORT_FILE=C:\Users\John\ZebraTester\MyTests\Test01Cluster.pdf


REM -- transmit cluster job --
java PrxJob transmitClusterJob "%CLUSTER_NAME%" "%LOAD_TEST_PROGRAM%" %LOAD_TEST_ARGUMENTS% 
SET CLUSTER_JOB_ID=%ERRORLEVEL%
IF %CLUSTER_JOB_ID% LSS 0 (
  ECHO Error %CLUSTER_JOB_ID%: unable to define cluster job
  GOTO ABORT_END
)
ECHO cluster job %CLUSTER_JOB_ID% transmitted


REM -- start cluster job and split input file "userAccounts.txt" --
java PrxJob startClusterJob "%CLUSTER_NAME%" %CLUSTER_JOB_ID% -split userAccounts.txt "#"
SET STATUS=%ERRORLEVEL%
IF %STATUS% NEQ 0 (
  ECHO Error %STATUS%: unable to start cluster job %CLUSTER_JOB_ID%
  GOTO ABORT_END
)
ECHO cluster job %CLUSTER_JOB_ID% started on %CLUSTER_NAME%


REM -- wait for cluster job completion -- 
java PrxJob waitForClusterJobCompletion "%EXECAGENT_NAME%" %CLUSTER_JOB_ID%
SET STATUS=%ERRORLEVEL%
IF %STATUS% NEQ 0 (
  ECHO Error %STATUS%: unable to wait for cluster job %CLUSTER_JOB_ID%
  GOTO ABORT_END
)
ECHO cluster job %CLUSTER_JOB_ID% completed


REM -- acquire cluster job result file --
java PrxJob acquireClusterJobResultFile "%CLUSTER_NAME%" %CLUSTER_JOB_ID% "%RESULT_FILE%"
SET STATUS=%ERRORLEVEL%
IF %STATUS% NEQ 0 (
  ECHO Error %STATUS%: unable to acquire cluster job %CLUSTER_JOB_ID% result file
  GOTO ABORT_END
)
ECHO job %CLUSTER_JOB_ID% result file acquired


REM -- generate PDF detail report --
java PdfReport clear
java PdfReport loadWithDetailReport "%RESULT_FILE%" -output "%REPORT_FILE%"
ECHO cluster job %CLUSTER_JOB_ID% PDF detail report created


ECHO cluster job %CLUSTER_JOB_ID% successful done
EXIT /B 0


:ABORT_END 
ECHO cluster job failed
EXIT /B -1
