package com.zensar.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		// session.setMaxInactiveInterval(5);
		PrintWriter outP = response.getWriter();
	
		String username = request.getParameter("username");
		session.setAttribute("uname", username);
		
		String logoutUrlEnc = response.encodeURL("logout");
		outP.println("<p><a href='" + logoutUrlEnc + "'>Logout</a></p>");
		
		outP.println("<p>Dear " + username + " Welcome to Zensar Home! </p>");
		outP.println("<p><a href='searchInfo'>Search</a></p>");
		outP.println("<p><a href='bookInfo'>Amazon India</a></p>");
		String productUrlEnc = response.encodeURL("product");
		outP.println("<p>To select products <a href='"+ productUrlEnc +"'>click here!</a></p>");
		
		System.out.println("Session ID in Welcome Servlet: " + session.getId());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
