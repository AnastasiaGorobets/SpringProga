<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

Enter information about student:
<form action="/student/newStudent" method="post">
  Name:<input name="name">
  Sername:<input name="sername">
  Group:
  <select  name="groups" size="1">
    <option  value="kit12">Kit12</option>
    <option value="kit22a">Kit22a</option>
    <option value="kit22b">Kit22b</option>
    <option value="kit32">Kit32</option>
  </select>

  <input type="submit" name="enter">

</form>

</body>
</html>
