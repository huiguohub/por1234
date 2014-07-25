Instructions for running this Web application

1.	Unzip the file to a local path, such as c:\xyz\por1234

2.	Download maven (if maven has not been installed) and Java 7 JDK to step up the environment (I use the latest version of Jetty plug-in, 9.2.1.v20140609, which needs Java 7 to compile it)
a.	Set %JAVA_HOME% environment variable to C:\Program Files\Java\jdk1.7.0_65
b.	Add %PATH% environment variable for X:/Maven installation home/bin, that can run mvn.bat executable from any path.
c.	Log off the system and login again to make the env variables take effect

3.	Go to c:\xyz\por1234 directory, where pom.xml is exist in that directory

4.	Run the command “mvn.bat jetty:run”, or “mvn.bat org.eclipse.jetty:jetty-maven-plugin:run” (for first running)
 

5.	The project will be compile by maven, and download necessary dependencies.
 

6.	Compilation is done and the Jetty server is running at 9998 port (I specify jetty-maven-plugin will run at 9998 port in pom.xml)
 

7.	open IE, type http://localhost:9998/por1234/register.jsp, then you will see registration page
 

8.	Type in the registration information into the form, if all information is good, will create a new account at http://myopenissues.com/magento/, and then return the succeed Page 
 

9.	go to the http://localhost:9998/por1234/register.jsp again, if user input the same email address as the last step, it will return an error page that shows the account is already existed.
 

10.	go to the http://localhost:9998/por1234/register.jsp again, if user input an invalid email address, such xyz@gmail, it will return an error page which indicates “email” is not a valid hostname.

 

So, basically based on the user input on http://localhost:9998/por1234/register.jsp page, this web application will return either success page or error page based on the succeed or failed in creation account in http://myopenissues.com/magento/.

