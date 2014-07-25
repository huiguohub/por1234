<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Failed</title>
</head>
<body>
<%String message = (String) request.getAttribute("message");%>
	<div class="container">
		<h2>Error occurred</h2>
		<h4>Feedback message from http://myopenissues.com/magento/</h4>
		<p><%=message%></p>
	</div>	
</body>
</html>