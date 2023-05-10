

<%@page import="java.util.Date" %>

<%!  
	Date d=null;
	String date=""; //it behaves like instance variables
%>

<% 

	d=new Date();  //it behaves like processing methods
   date=d.toString();

%>

<h1 style='color:red;'> 
  Today date is <%= date %>
  </h1>