/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.1.v20140609
 * Generated at: 2014-07-25 19:16:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Registration Form</title>\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"title\" align=\"center\">\r\n");
      out.write("\t<table class=\"title\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t  \t<td>\r\n");
      out.write("\t  \t\t<img src=\"images/aol.png\" alt=\"AOL logo\" />\r\n");
      out.write("\t  \t</td>\r\n");
      out.write("\t  \t<td class=\"title\">\r\n");
      out.write("\t  \t\t<label>This web page is used to sign up a new account for http://myopenissues.com/magento/</label>\r\n");
      out.write("\t  \t</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("\t</table>\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"form-actions\">\r\n");
      out.write("\t\t<label class=\"control-label\"> ");

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
 			
      out.write(' ');
      out.print(message);
      out.write(" Click here to, <a\r\n");
      out.write("\t\t\thref=\"http://myopenissues.com/magento/index.php/customer/account/login/\">\r\n");
      out.write("\t\t\t\t\tLog in</a> ");

 		}
      out.write("\r\n");
      out.write("\t\t</label>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<form method=\"post\" action=\"CreateServlet\" autocomplete=\"on\" class=\"form-horizontal\"\r\n");
      out.write("\t\t\t\tonsubmit=\"return validateFormOnSubmit(this);\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"success_url\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" /> <input\r\n");
      out.write("\t\t\t\t\ttype=\"hidden\" name=\"error_url\" value=\"\" />\r\n");
      out.write("\t\t\t\t<table class=\"personal\">\r\n");
      out.write("\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div class=\"tabletitle\">\r\n");
      out.write("\t\t\t\t\t<label>Personal Information</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td/>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\t\t\r\n");
      out.write("\t\t\t\t<td class=\"firstname\">\r\n");
      out.write("\t\t\t\t\t<div class=\"firstname\">\r\n");
      out.write("\t\t\t\t\t<label class=\"control-label\">First Name</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t <div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-user\" rel=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"Enter your First Name\"></i></span> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input-xlarge\" id=\"fname\" name=\"fname\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"");
      out.print(fnameMessage);
      out.write("\" autofocus=\"autofocus\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"lastname\">\r\n");
      out.write("\t\t\t\t\t<label class=\"control-label\">Last Name</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-user\" rel=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"Enter your Last Name\"></i></span> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input-xlarge\" id=\"lname\" name=\"lname\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"");
      out.print(lnameMessage);
      out.write("\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"control-label\">Email</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-envelope\"\r\n");
      out.write("\t\t\t\t\t\t\t\trel=\"tooltip\" title=\"Enter your Email\"></i></span> <input type=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"input-xlarge\" id=\"email\" name=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"");
      out.print(emailMessage);
      out.write("\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td/>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t<label> <input type=\"checkbox\" name=\"is_subscribed\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"1\"> Sign Up for Newsletter\r\n");
      out.write("\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td/>\r\n");
      out.write("\t\t\t\t</tr>\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p/>\t\t\t\t\r\n");
      out.write("\t\t\t\t<table class=\"password\">\r\n");
      out.write("\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div class=\"tabletitle\">\r\n");
      out.write("\t\t\t\t\t<label>Login Information</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td/>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"firstpass\">\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"control-label\">Password</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-lock\" rel=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"Enter your passoword\"></i></span> <input type=\"Password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"password\" class=\"input-xlarge\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"");
      out.print(passwordMessage);
      out.write("\" required>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input-prepend\" id='passwordMessage'> </span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"confirmpass\">\r\n");
      out.write("\t\t\t\t<div class=\"control-group\">\r\n");
      out.write("\t\t\t\t\t<label class=\"control-label\">Password</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"input-prepend\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"add-on\"><i class=\"icon-lock\" rel=\"tooltip\"\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle=\"Repeat your password\"></i></span> <input type=\"Password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"repassword\" class=\"input-xlarge\" name=\"repassword\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Re-enter Password\" required disabled=\"true\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<span id='message'> </span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<p/>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"control-group\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<label class=\"control-label\"></label>\r\n");
      out.write("\t\t\t\t\t<div class=\"controls\">\r\n");
      out.write("\t\t\t\t\t<table class=\"submit\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"submit\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\" id=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\tdisabled=\"true\" name=\"submit\">Create My Account</button>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"clear\">\r\n");
      out.write("\t\t\t\t\t\t<button type=\"reset\" class=\"btn\" id=\"clear\" name=\"clear\">Clear</button>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"http://code.jquery.com/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("    \t$(document).ready(function(){\r\n");
      out.write("\t  $('#repassword').on('keyup', function () {\r\n");
      out.write("\t    if (($(this).val().length > 5) && ($(this).val() == $('#password').val())){\r\n");
      out.write("\t        $('#message').html('matching').css('color', 'green');\r\n");
      out.write("\t        $('#submit').prop('disabled', false);\r\n");
      out.write("\t    } else {\r\n");
      out.write("\t    \t$('#message').html('not matching').css('color', 'red');\r\n");
      out.write("\t    \t$('#submit').prop('disabled', true);\r\n");
      out.write("\t    }\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#password').on('keyup', function() {\r\n");
      out.write("\t\t\tif($(this).val().length < 6){\r\n");
      out.write("\t\t\t\t$('#passwordMessage').html('Password should be 6 character long').css('color', 'red');\r\n");
      out.write("\t\t\t\t$('#repassword').prop(\"disabled\", true);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\t$('#passwordMessage').text('');\r\n");
      out.write("\t\t\t\t$('#repassword').prop(\"disabled\", false);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\t  \r\n");
      out.write("\t  $('#clear').click(function(){\r\n");
      out.write("        \t$('#message').text('');\r\n");
      out.write("        \t$('#submit').prop(\"disabled\", true);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("    </script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("    \tfunction validateFormOnSubmit(theForm){\r\n");
      out.write("    \t\tif(validateName(theForm.fname)){\r\n");
      out.write("    \t\t\tif(validateName(theForm.lname)){\r\n");
      out.write("    \t\t\t\tif(validateEmail(theForm.email)){\r\n");
      out.write("    \t\t\t\t\tif(validatePassword(theForm.password))\r\n");
      out.write("    \t\t\t\t\t\treturn true;\r\n");
      out.write("    \t\t\t\t}\r\n");
      out.write("    \t\t\t}\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\treturn false;\r\n");
      out.write("    \t}\r\n");
      out.write("\r\n");
      out.write("    \tfunction validateName(name){\r\n");
      out.write("    \t\tvar alp = /^[a-zA-Z]+$/;\r\n");
      out.write("\t        if (name.value.match(alp) && name.value.length >= 3) {\r\n");
      out.write("               return true;\r\n");
      out.write("           }\r\n");
      out.write("           else {\r\n");
      out.write("           \t\tname.value = \"\";\r\n");
      out.write("            \tname.setAttribute('placeholder',\"Please enter your name to continue\");\r\n");
      out.write("             \tname.style.background = 'yellow';\r\n");
      out.write(" \t            name.focus();\r\n");
      out.write("               return false;\r\n");
      out.write("           }\r\n");
      out.write("    \t}\r\n");
      out.write("\r\n");
      out.write("    \tfunction validateEmail(email){\r\n");
      out.write("    \t   var atpos = x.indexOf(\"@\");\r\n");
      out.write("           var dotpos = x.lastIndexOf(\".\");\r\n");
      out.write("           if (atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= x.length) {\r\n");
      out.write("  \t\t\t\temail.style.background = 'yellow';\r\n");
      out.write("  \t\t\t\temail.value = \"Enter valid email id\";\r\n");
      out.write("                 return false;\r\n");
      out.write("             }\r\n");
      out.write("\r\n");
      out.write("           else {\r\n");
      out.write("               return true;\r\n");
      out.write("           }\r\n");
      out.write("    \t}\r\n");
      out.write("\r\n");
      out.write("    \tfunction validatePassword(password){\r\n");
      out.write("\r\n");
      out.write("    \t\tif(password.value.length < 6){\r\n");
      out.write("    \t\t\tpassword.value = \"\";\r\n");
      out.write("    \t\t\ttheForm.repassword.value = \"\";\r\n");
      out.write("    \t\t\treturn false;\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\treturn true;\r\n");
      out.write("    \t}\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
