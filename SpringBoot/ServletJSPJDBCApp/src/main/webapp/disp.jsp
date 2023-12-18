<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Page</title>
</head>
<body bgcolor="blue">
	<center>
		<h1>STUDENT RECORDS</h1>
		<c:choose>
			<c:when test="${student ne null || !empty student }">
				<h1 style='color: red; text-align: center'>NO RECORD TO DISPLAY
				</h1>
			</c:when>
			<c:otherwise>
				<table>
					<tr>
						<th>SID</th>
						<th>SNAME</th>
						<th>SAGE</th>
						<th>SADDRESS</th>
					</tr>
						<c:forEach items="${student}" var="std">
						<tr>
							<td>${std.sid}</td>
						</tr>
					</c:forEach>

				</table>

			</c:otherwise>
		</c:choose>
	</center>
</body>
</html>