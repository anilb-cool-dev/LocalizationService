call mvn tomcat7:undeploy
call mvn clean compile package
call mvn tomcat7:deploy