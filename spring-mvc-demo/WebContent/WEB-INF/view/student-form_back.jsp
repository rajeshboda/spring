<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/styles.css">

<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />

		<br>
		<br>
	
		Last name: <form:input path="lastName" />

		<br>
		<br>
		
		Country 
		<form:select path="country">
			<form:option value="India" label="India"></form:option>
			<form:option value="Germany" label="Germany"></form:option>
			<form:option value="France" label="France"></form:option>
			<form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="USA" label="USA"></form:option>

		</form:select>

		<input type="submit" value="Submit" />

	</form:form>


</body>

</html>












