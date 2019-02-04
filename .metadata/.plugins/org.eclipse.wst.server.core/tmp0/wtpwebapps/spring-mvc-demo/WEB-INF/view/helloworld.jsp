<!DOCTYPE html>
<html>
<head>
<title>This is displaying what you enter</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/styles.css">
</head>
<body>
<img
		src="${pageContext.request.contextPath}/resources/images/spring-logo.png">
	<h3>Student Name by using param.studentName: ${param.firstName}</h3>
	<h3>Accessing from model: ${message}</h3>
	

</body>
</html>