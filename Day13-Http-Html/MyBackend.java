

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyBackend
 */
@WebServlet("/Myformbackend")
public class MyBackend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().print("Served at: ");
		System.out.println("Hello you have called server");
		//PrinterWriter out= response.getWriter();
		//out.print("Hello this is from server");
		
		String name = request.getParameter("user");
		int age=Integer.parseInt(request.getParameter("age"));
		
		response.getWriter().print("Your name is: "+name + "<br>");
		response.getWriter().print("Your age is: "+ age +"<br>");
		if(age>18)
		{
			response.getWriter().print("You can vote!!!!");
		}
		else
		{
			response.getWriter().print("You cannot vote!!!!");
		}
	}

}
