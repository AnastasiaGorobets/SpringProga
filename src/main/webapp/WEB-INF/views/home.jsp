<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Home</title>
</head>
<style>



</style>

<body>

Log in, please :<br>
	<spring:url value="/secure/" var="secureUrl" />
	<a href="${secureUrl}" title="Secure">I am a student</a><br />

	<spring:url value="/admin/" var="adminUrl" />
	<a href="${adminUrl}" title="Admin">I am a teacher</a>
</body>
</html>
