<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
<link href="css/style.css" rel="stylesheet" media="screen">
</head>
<body>
	<div class="title" align="center">
	<table class="title">
	  <tr>
	  	<td>
	  		<img src="images/aol.png" alt="AOL logo" />
	  	</td>
	  	<td class="title">
	  		<label>This web page is used to sign up a new account for http://myopenissues.com/magento/</label>
	  	</td>
	  </tr>
	</table>		
	</div>
	<div class="form-actions">
		<label class="control-label"> <%
 		String message = (String) request.getAttribute("message");
 		String fnameMessage = (String) request.getAttribute("fname");
 		String lnameMessage = (String) request.getAttribute("lname");
 		String emailMessage = (String) request.getAttribute("email");
 		String passwordMessage = (String) request.getAttribute("password");

 		if (fnameMessage == null || fnameMessage.equals("")) {
 			fnameMessage = "First Name";
 		}
 		if (lnameMessage == null || lnameMessage.equals("")) {
 			lnameMessage = "Last Name";
 		}
 		if (emailMessage == null || emailMessage.equals("")) {
 			emailMessage = "Email";
 		}
 		if (passwordMessage == null || passwordMessage.equals("")) {
 			passwordMessage = "Password";
 		}
 		if (message != null && message != "") {
 			%> <%=message%> Click here to, <a
			href="http://myopenissues.com/magento/index.php/customer/account/login/">
					Log in</a> <%
 		}%>
		</label>
		
		<form method="post" action="CreateServlet" autocomplete="on" class="form-horizontal"
				onsubmit="return validateFormOnSubmit(this);">
				
				<input type="hidden" name="success_url" value=${message } /> <input
					type="hidden" name="error_url" value="" />
				<table class="personal">
				<tr class="title">
				<td>
					<div class="tabletitle">
					<label>Personal Information</label>
					</div>
				</td>
				<td/>
				</tr>
				<tr>		
				<td class="firstname">
					<div class="firstname">
					<label class="control-label">First Name</label>
					<div class="controls">
						 <div class="input-prepend">
							<span class="add-on"><i class="icon-user" rel="tooltip"
								title="Enter your First Name"></i></span> <input type="text"
								class="input-xlarge" id="fname" name="fname"
								placeholder="<%=fnameMessage%>" autofocus="autofocus" required>
						</div>
					</div>
					</div>
				</td>
				<td class="lastname">
					<label class="control-label">Last Name</label>
					<div class="controls">
						<div class="input-prepend">
							<span class="add-on"><i class="icon-user" rel="tooltip"
								title="Enter your Last Name"></i></span> <input type="text"
								class="input-xlarge" id="lname" name="lname"
								placeholder="<%=lnameMessage%>" required>
						</div>
					</div>				
				</td>
				</tr>
				<tr>
				<td>
				<div class="control-group">
					<label class="control-label">Email</label>
					<div class="controls">
						<div class="input-prepend">
							<span class="add-on"><i class="icon-envelope"
								rel="tooltip" title="Enter your Email"></i></span> <input type="email"
								class="input-xlarge" id="email" name="email"
								placeholder="<%=emailMessage%>" required>
						</div>
					</div>
				</div>
				</td>
				<td/>
				</tr>
				<tr>
				<td>
				<div class="control-group">
					<div class="controls">
						<div class="checkbox">
							<label> <input type="checkbox" name="is_subscribed"
								value="1"> Sign Up for Newsletter
							</label>
						</div>
					</div>
				</div>
				</td>
				<td/>
				</tr>				
				</table>
				
				<p/>				
				<table class="password">
				<tr class="title">
				<td>
					<div class="tabletitle">
					<label>Login Information</label>
					</div>
				</td>
				<td/>
				</tr>
				<tr>
				<td class="firstpass">
				<div class="control-group">
					<label class="control-label">Password</label>
					<div class="controls">
						<div class="input-prepend">
							<span class="add-on"><i class="icon-lock" rel="tooltip"
								title="Enter your passoword"></i></span> <input type="Password"
								id="password" class="input-xlarge" name="password"
								placeholder="<%=passwordMessage%>" required>
						</div>
						<span class="input-prepend" id='passwordMessage'> </span>
					</div>
				</div>
				</td>
				<td class="confirmpass">
				<div class="control-group">
					<label class="control-label">Password</label>
					<div class="controls">
						<div class="input-prepend">
							<span class="add-on"><i class="icon-lock" rel="tooltip"
								title="Repeat your password"></i></span> <input type="Password"
								id="repassword" class="input-xlarge" name="repassword"
								placeholder="Re-enter Password" required disabled="true">
						</div>
						<span id='message'> </span>

					</div>
				</div>		
				</td>
				</tr>
				</table>
				<p/>						
				<div class="control-group" align="center">
					<label class="control-label"></label>
					<div class="controls">
					<table class="submit">
					<tr>
					<td class="submit">
						<button type="submit" class="btn btn-success" id="submit"
							disabled="true" name="submit">Create My Account</button>
							</td>
					<td class="clear">
						<button type="reset" class="btn" id="clear" name="clear">Clear</button>
						</td>
						</tr>
						</table>	
					</div>
				</div>	
		</form>
	</div>

	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script>
    	$(document).ready(function(){
	  $('#repassword').on('keyup', function () {
	    if (($(this).val().length > 5) && ($(this).val() == $('#password').val())){
	        $('#message').html('matching').css('color', 'green');
	        $('#submit').prop('disabled', false);
	    } else {
	    	$('#message').html('not matching').css('color', 'red');
	    	$('#submit').prop('disabled', true);
	    }
		});

		$('#password').on('keyup', function() {
			if($(this).val().length < 6){
				$('#passwordMessage').html('Password should be 6 character long').css('color', 'red');
				$('#repassword').prop("disabled", true);
			}
			else{
				$('#passwordMessage').text('');
				$('#repassword').prop("disabled", false);
			}
			
		});	  
	  $('#clear').click(function(){
        	$('#message').text('');
        	$('#submit').prop("disabled", true);
		});
	});
    </script>
	<script type="text/javascript">
    	function validateFormOnSubmit(theForm){
    		if(validateName(theForm.fname)){
    			if(validateName(theForm.lname)){
    				if(validateEmail(theForm.email)){
    					if(validatePassword(theForm.password))
    						return true;
    				}
    			}
    		}
    		return false;
    	}

    	function validateName(name){
    		var alp = /^[a-zA-Z]+$/;
	        if (name.value.match(alp) && name.value.length >= 3) {
               return true;
           }
           else {
           		name.value = "";
            	name.setAttribute('placeholder',"Please enter your name to continue");
             	name.style.background = 'yellow';
 	            name.focus();
               return false;
           }
    	}

    	function validateEmail(email){
    	   var atpos = x.indexOf("@");
           var dotpos = x.lastIndexOf(".");
           if (atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= x.length) {
  				email.style.background = 'yellow';
  				email.value = "Enter valid email id";
                 return false;
             }

           else {
               return true;
           }
    	}

    	function validatePassword(password){

    		if(password.value.length < 6){
    			password.value = "";
    			theForm.repassword.value = "";
    			return false;
    		}
    		return true;
    	}
    </script>
</body>
</html>