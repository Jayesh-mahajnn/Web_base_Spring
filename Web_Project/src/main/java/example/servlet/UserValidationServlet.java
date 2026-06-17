package example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.bean.User;
import example.bean.UserValidator;

/**
 * Servlet implementation class UserValidationServlet
 */
@WebServlet("/doValidate")
public class UserValidationServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String responseText = "<h1 style = 'color:red'> Access denied due to bad credentials </h1> ";
		
		//check whether user is valid [admin , asAdim] or invalid
		//if valid , respond success otherwise failure
		
	   String userName = 	request.getParameter("uid");
	   String password = 	request.getParameter("pwd");
	   
	   User userObj = new User(userName , password);
	   boolean valid = UserValidator.isValid(userObj);
	   
	   if(valid)
	   {
		   responseText = "<h1 style = 'color:green'> Congratulation  , you have done to login</h1> ";
		   
	   }
	   out.println(responseText);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
