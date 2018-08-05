call runcrud.bat
if "%ERRORLEVEL%" == "0" goto
echo.
echo runcrud.bat has errors - breaking work
goto stoptomcat


start chrome http://localhost:8080/crud/v1/task/getTasks

:stoptomcat
call %CATALINA_HOME%\bin\shutdown.bat
echo runcrud does not work


echo.
echo Work is finished.
