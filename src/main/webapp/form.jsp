<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 12.07.2021
  Time: 21:10
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
<%--    <p>
        Country: <select name="country">
        <option>Iran</option>
        <option>Turkey</option>
        <option>China</option>
        <option>Germany</option>
    </select>
    </p>--%>
    <input type="submit" value="Pass data">
</form>
<form action="/formviev" method="get">
    <input type="submit" value="View">
</form>
</body>
</html>
