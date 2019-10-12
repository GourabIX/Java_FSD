<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<%@ include file="header.html" %>
	
	<%-- Declaration --%>
	<%!
		int count = 0;
		String name;
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
	%>
	
	<%-- Scriptlet --%>
	
	<%
		String username = request.getParameter("username");			// "username" is a form-filled name.
		setName(username);
		session.setAttribute("uname", username);
		session.setMaxInactiveInterval(5);
		
		String productUrlEnc = response.encodeURL("product.jsp");
	%>
	
	<p> Dear <%= getName() %> Welcome to the Online Shopping Center for Infinity!</p>
	<p> Yours session timeout period is <%=session.getMaxInactiveInterval() %> seconds. </p>
	<p> To view and purchase products <a href="<%=productUrlEnc %>">Click here!</a>
	
	<%@ include file="footer.html" %>
</body>
</html>