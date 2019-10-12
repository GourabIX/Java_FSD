<jsp:useBean id="beanObj" class="com.zensar.models.LoginBean" scope="request"></jsp:useBean>
<jsp:setProperty property="username" name="beanObj"/>
<jsp:setProperty property="password" name="beanObj" param="passwd"/>

<%
// 	String username = request.getParameter("username");
// 	String password = request.getParameter("passwd");
	
	// invoke Business logic of model
	if (beanObj.validateUser())
	{
		// pageContext.forward("welcome.jsp");
		
		// Old & Deprecated way :
 		// RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
 		// rd.forward(request, response);
		
 		%>
 		<jsp:forward page="welcome.jsp">
 		<jsp:param value="Core Java" name="book1"/>
 		<jsp:param value="Spring" name="book2"/>
 		</jsp:forward>
 		<%
	}
	else
	{
		%>
		<p>"Oops! Wrong username / password"</p>
		<jsp:include page="login.jsp"></jsp:include>
		<%
	}
%>