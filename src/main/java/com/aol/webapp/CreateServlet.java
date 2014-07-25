package com.aol.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/**
 * Servlet implementation class CreateServlet
 */
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String address = null;
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmation = request.getParameter("repassword");
		String isSubscribed = request.getParameter("is_subscribed");
		String success_url = request.getParameter("success_url");
		String error_url = request.getParameter("error_url");
			
		BasicCookieStore cookieStore = new BasicCookieStore();
		BasicClientCookie cookie = new BasicClientCookie("SESSIONID",
				"por1234");
		cookie.setDomain(".myopenissues.com");
		cookie.setPath("/magento");
		cookieStore.addCookie(cookie);

		HttpClientBuilder builder = HttpClientBuilder.create();
		builder.setDefaultCookieStore(cookieStore);
		builder.setRedirectStrategy(new LaxRedirectStrategy());

		HttpClient client = builder.build();
		HttpPost post = new HttpPost(
				"http://myopenissues.com/magento/index.php/customer/account/createpost/");

		try {
			List<org.apache.http.NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(
					1);
			nameValuePairs.add(new BasicNameValuePair("success_url",
					success_url));
			nameValuePairs.add(new BasicNameValuePair("error_url",
					error_url));

			nameValuePairs.add(new BasicNameValuePair("firstname", fname));
			nameValuePairs.add(new BasicNameValuePair("lastname", lname));
			nameValuePairs.add(new BasicNameValuePair("email", email));
			nameValuePairs.add(new BasicNameValuePair("is_subscribed",
					isSubscribed));
			nameValuePairs
					.add(new BasicNameValuePair("password", password));
			nameValuePairs.add(new BasicNameValuePair("confirmation",
					confirmation));
			post.setEntity(new UrlEncodedFormEntity(nameValuePairs));

			HttpClientContext context = HttpClientContext.create();
			HttpResponse res = client.execute(post, context);
		
			HttpEntity resEntity = res.getEntity();
			System.out.println("----------------------------------------");
			System.out.println("Request retunning status: " + res.getStatusLine());
			if (resEntity != null) {
				String responseBody = EntityUtils.toString(resEntity);
				
				if (res.getStatusLine().getStatusCode() == 200) {
					String succeed = "success-msg";
					String failed = "error-msg";
					int succIndex = responseBody.indexOf(succeed);
					int failIndex = responseBody.indexOf(failed);
					if (succIndex >= 0) {
						address = "./success.jsp";
						int beginIndex = responseBody.substring(succIndex).indexOf("<ul>");
						int endIndex = responseBody.substring(succIndex).indexOf("</ul>") + 5;
						request.setAttribute("message", 
								responseBody.substring(succIndex).substring(beginIndex, endIndex)); 
					}
					else if (failIndex >= 0) {
						address = "./error.jsp";
						int beginIndex = responseBody.substring(failIndex).indexOf("<ul>");
						int endIndex = responseBody.substring(failIndex).indexOf("</ul>") + 5;
						request.setAttribute("message", 
								responseBody.substring(failIndex).substring(beginIndex, endIndex));
					}
					else {
						address = "./error.jsp";
						String message = "Unknown returning message.";
						request.setAttribute("message", message);
					}
				}
				else {
					address = "./error.jsp";
					String message = "Request Fail! The return HTTP status code is: " 
								+ res.getStatusLine().getStatusCode();
					request.setAttribute("message", message);
				}
			}                        
			else {
				address = "./error.jsp";
				String message = "Request Fail! No returning entity obtained.";
				request.setAttribute("message", message);
			}						
			
			EntityUtils.consume(resEntity);
			RequestDispatcher dispatcher = request.getRequestDispatcher(address);
			dispatcher.forward(request, response);		
		} 
		catch (ClientProtocolException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			// When HttpClient instance is no longer needed,
			// shut down the connection manager to ensure
			// immediate deallocation of all system resources			
			client.getConnectionManager().shutdown();  
		}
	}

}
