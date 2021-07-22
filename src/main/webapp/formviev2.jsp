<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 16.07.2021
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <h3>Viev</h3>
    <h3>${result}</h3>--%>
<c:forEach items="${userList}" var="user" varStatus="status">
<%--<c:forEach items="${result}" var="user" varStatus="status">--%>
    <%--            <tr>--%>
    <%--                <td>${status.index}</td>--%>
    <%--                <td>${user.name}</td>--%>
    <%--                <td>${user.years}</td>--%>
    <%--            </tr>--%>

    <h2> ${status.index} ${user.name} ${user.surname} ${user.years} </h2>
</c:forEach>
</body>
</html>
