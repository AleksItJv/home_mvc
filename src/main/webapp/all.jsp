<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 12.07.2021
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List of users : </h1>

<c:forEach items="${list}" var="user" varStatus="status">
    <%--            <tr>--%>
    <%--                <td>${status.index}</td>--%>
    <%--                <td>${user.name}</td>--%>
    <%--                <td>${user.years}</td>--%>
    <%--            </tr>--%>

    <h2> ${status.index} ${user.name} ${user.surname} ${user.years} </h2>
</c:forEach>
<br/>
<br/>

<a href="/form">form</a>
<br/>
<a href="/all">all</a>
<br/>
<a href="/index.jsp">home</a>
<a>---------------------------------------------------</a>
<br/>
<a href="/form2">form</a>
<br/>

</body>
</html>
