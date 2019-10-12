package com.zensar.controllers;

/**
 * @author Gourab Sarkar, 2019.
 * @version 2.0
 * @creation_date Sep. 21, 2019 05:24 PM
 * @modification_date Sep. 28, 2019 11:51 AM
 * @copyright Zensar Technologies, India. All rights reserved.

*/

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.daos.UserDao;
import com.zensar.daos.UserDaoImpl;
import com.zensar.entities.User;
import com.zensar.exceptions.ServiceException;
import com.zensar.services.UserService;
import com.zensar.services.UserServiceImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/checkuser")
public class LoginController extends HttpServlet {
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
		public void init() throws ServletException {
			
			UserDao userDao = new UserDaoImpl();
			UserService userService = new UserServiceImpl();
			((UserServiceImpl) userService).setUserDao(userDao);
			setUserService(userService);
			
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
					RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
					dispatcher.forward(request, response);
				}
				else
				{
					outP.println("<p>Sorry! Invalid username / password! </p>");
					RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
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