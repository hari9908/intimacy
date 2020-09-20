<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>friends</title>
</head>
<body>

	<div id="">

		<div>
			<h3>My Friends</h3>


			<table>

				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>

				<tr>
					<c:forEach var="fl" items="${friendsList}">
						<td>${fl.firstName}</td>
						<td>${fl.lastName}</td>
						<td>${fl.email}</td>
					</c:forEach>
				</tr>
			</table>

		</div>
	</div>

</body>
</html>