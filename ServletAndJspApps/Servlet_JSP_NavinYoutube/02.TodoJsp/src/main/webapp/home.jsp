<%@page import="java.util.Scanner"%><!--Directive Tag used for import the packages  -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="error.jsp"%>

<%-- <%@ include file="header.jsp " %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     
     <%
       int k=9/0;
     %>
     
     
     
	<!--Declaration Tag( content not goes to service method)  -->
	<%!int coef = 3;
	Scanner sc = new Scanner(System.in);
	%>

	<!--Scriptlet tag (all content goes directly to Service method)  -->
	<%
	out.println(7 + 5);
	%>
	
	
	<!-- Expression Tag(access the number directly add automatically in "out.println(coef);" -->
	My Fav Number is : <%= coef %>
</body>
</html>