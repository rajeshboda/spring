<!DOCTYPE html>
<html>
<head>
<title>This is a simple form</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/styles.css">
</head>

<body>
	<form action="processFormVersionThree" method="GET">
		<input type="text" name="firstName" placeholder="What's your first name?" />
		<input type="text" name="lastName" placeholder="What's your last name?" />
		<input type="submit" />
	</form>
</body>
</html>