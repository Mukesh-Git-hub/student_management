<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/style.css'/>">

</head>
<body>
<h2>Add New Student</h2>
<form action="${pageContext.request.contextPath}/students" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    <br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>
    <br>
    <input type="submit" value="Add Student">
</form>
<br>
<a href="${pageContext.request.contextPath}/students">Back to Student List</a>
</body>
</html>