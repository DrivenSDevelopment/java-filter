# java-filter
Demonstration of Java servlet filter functionality in a simple web app. 

Requirements:
Demo was created on Tomcat 8.5.16. Webapp may still work on slightly previous versions. 

Jars Required:
https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api/3.0.1
https://mvnrepository.com/artifact/javax.servlet/jstl/1.2
https://dev.mysql.com/downloads/connector/j/5.1.html

Place jars in lib folder of your Tomcat instance.


Setup:
1. Extract and copy repository under the webapps folder in your Tomcat instance:

%CATALINA_ROOT%/webapps/java-filter

2. Run Tomcat with 'java-filter' as the context path of your URL

ex: localhost:8080/java-filter

Note: make sure other servlets or web applications on the server are tying up your default URL path. 

