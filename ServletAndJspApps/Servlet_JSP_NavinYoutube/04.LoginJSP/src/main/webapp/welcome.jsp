<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	String uname = (String) session.getAttribute("username");
	if (uname == null) {
		response.sendRedirect("login.jsp");
	}
	%>
	Welcome Mr :${username}
	<br>

	<a href="videos.jsp">Videos Here</a>

	<form action="Logout">
		<input type="submit" value="Logout">
	</form>
</body>
</html>