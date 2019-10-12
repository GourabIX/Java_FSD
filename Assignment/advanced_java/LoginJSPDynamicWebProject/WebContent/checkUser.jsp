<%
	String username = request.getParameter("username");
	String password = request.getParameter("passwd");
	
	// Business logic
	if (username != null && password != null && username.equals("gourab") && password.equals("welcome"))
	{
		pageContext.forward("welcome.jsp");
		
		// Old & Deprecated way :
		// RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		// rd.forward(request, response);
	}
	else
	{
		out.println("Oops! Wrong username / password");
		pageContext.include("login.jsp");
	}
%>