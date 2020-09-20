
<head>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/guest.css">
<script src="${pageContext.request.contextPath}/resources/js/guest.js"></script>

</head>

<form action="login" method="get">
	<input type="email" label="Email" name="email" /> <input
		type="password" label="password" />
	<button type="submit" value="SUBMIT"></button>
	<a href="forgotPassword">Forgot Password</a>
</form>