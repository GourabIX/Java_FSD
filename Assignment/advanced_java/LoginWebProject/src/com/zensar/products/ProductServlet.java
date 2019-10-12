package com.zensar.products;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession(false);			// don't create a new session
		PrintWriter outP = response.getWriter();
		if (session != null)
		{
			String username = (String) session.getAttribute("uname");
		
			String logoutUrlEnc = response.encodeURL("logout");
			outP.println("<p><a href='" + logoutUrlEnc + "'>Logout</a></p>");
		
			outP.println("Dear " + username + " view the products of your choice: ");
			outP.println("Session ID in ProductServlet: " + session.getId());
			outP.println("<p>Your session timeout period is " + session.getMaxInactiveInterval() + " seconds.</p>");
		}
		else
		{
			outP.println("<h2>Session expired!</h2>");
			outP.println("<p>Please <a href='login.html'>login again</a></p>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
