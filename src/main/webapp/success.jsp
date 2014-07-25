<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Successful</title>
</head>
</head>
<body>
	<%String message = (String) request.getAttribute("message");%>
	<%String fname = (String) request.getParameter("fname");%>
	<%String lname = (String) request.getParameter("lname");%>
	<%String email = (String) request.getParameter("email");%>
	<div class="container">
		<h2>Sign UP- Successful</h2>
		<p class="welcome-msg">Welcome, <%=fname%> <%=lname%>!</p>
		<h4>Feedback message from http://myopenissues.com/magento/</h4>
		<p><%=message%></p>				
		<p>
			Your registration email is <%=email%>. <a href="http://myopenissues.com/magento/index.php/customer/account/login/">
			Click here</a> to login your account
		</p>
	</div>
</body>
</html>