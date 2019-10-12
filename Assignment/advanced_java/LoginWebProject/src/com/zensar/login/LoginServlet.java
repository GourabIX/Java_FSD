package com.zensar.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.entities.*;

import com.zensar.daos.UserDao;
import com.zensar.daos.UserDaoImpl;
import com.zensar.exceptions.ServiceException;
import com.zensar.services.UserService;
import com.zensar.services.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// Call Business layer component
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		
		ServletContext context = config.getServletContext();					// "context" represents entire web application and is
																				// available to all servlets as a common resource.
		String driverClassName = context.getInitParameter("jdbcDriver");
		String dbUrl = context.getInitParameter("jdbcUrl");
		String dbUsername = context.getInitParameter("dbUser");
		String dbPassword = context.getInitParameter("dbPassword");
		
		try {
			// load JDBC Driver Class
			Class.forName(driverClassName);
			context.log("JDBC driver loaded successfully!");
			Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			context.log("MySQL database connection established successfully!");
			
			// create userDao object
			UserDao userDao = new UserDaoImpl();
			((UserDaoImpl) userDao).setConnection(conn);
			
			// create userService object
			UserService userService = new UserServiceImpl();
			((UserServiceImpl) userService).setUserDao(userDao);
			
			// setUserService to servlet
			setUserService(userService);
			context.log("UserService is set in LoginServlet.");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");			// get values for corresponding fields.
		String password = request.getParameter("passwd");
		User clientUser = new User();
		clientUser.setUsername(username);
		clientUser.setPassword(password);
		PrintWriter outP = response.getWriter();
		try {
			// 
			if (userService.validateUser(clientUser))
			{
				// outP.println("<p>Dear " + username + " Welcome to Zensar! </p>");
				RequestDispatcher dispatcher = request.getRequestDispatcher("welcome");
				dispatcher.forward(request, response);
			}
			else
			{
				outP.println("<p>Sorry! Invalid username / password! </p>");
				RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
				dispatcher.include(request, response);
			}
		} 
		catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
