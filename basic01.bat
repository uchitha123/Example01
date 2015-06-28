@echo off
IF EXIST C:\SourcesJava\Example01\target rmdir target /s /q
IF NOT EXIST C:\SourcesJava\Example01\target mkdir target
cd target
mkdir Example01
cd Example01
mkdir WEB-INF
xcopy C:\SourcesJava\Example01\web\* C:\SourcesJava\Example01\target\Example01 /e /i
rmdir config /s /q
cd WEB-INF
copy C:\SourcesJava\Example01\web\config\web.xml C:\SourcesJava\Example01\target\Example01\WEB-INF
mkdir lib
cd lib
copy C:\SourcesJava\Example01\lib C:\SourcesJava\Example01\target\Example01\WEB-INF\lib
cd ..
mkdir classes
cd C:\SourcesJava\Example01\src\com\basic\example01
set CLASSPATH="C:\Program Files\Apache Software Foundation\Apache Tomcat 8.0.3\lib\servlet-api.jar";.
javac -cp %CLASSPATH% -d C:\SourcesJava\Example01\target\Example01\WEB-INF\classes C:\SourcesJava\Example01\src\com\basic\example01\Example01.java
cd C:\SourcesJava\Example01\target\Example01
jar -cvf Example01.war * 
del "C:\Program Files\Apache Software Foundation\Apache Tomcat 8.0.3\webapps\Example01.war"
IF EXIST C:\Program Files\Apache Software Foundation\Apache Tomcat 8.0.3\webapps\Example01 rmdir Example01 /s /q
copy Example01.war "C:\Program Files\Apache Software Foundation\Apache Tomcat 8.0.3\webapps"
cd C:\SourcesJava\Example01



 