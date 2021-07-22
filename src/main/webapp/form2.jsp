<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 22.07.2021
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/form" method="post" modelAttribute="${user}">
    <p>Name : <input type="text" name="name"></p>
    <p>Surname : <input type="text" name="surname"></p>
    <p>Years : <input type="text" name="years" min="1"></p>
    <input type="submit" value="Pass data">
</form>
<form action="/formviev2" method="get">
    <input type="submit" value="View">
</form>
</body>
</html>
