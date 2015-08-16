<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Admin</title>
</head>
<body>

<spring:url value="/addNewStudent/" var="addUrl" />


<form action="${addUrl}">
	<input type="submit" value="Add new Student">
</form>


<form action="deleteAllStudents" method="get">

	<input type="submit" value="Delete All Students">
</form>








</body>
</html>
