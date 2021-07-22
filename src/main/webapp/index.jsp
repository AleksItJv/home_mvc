<%@ page import="java.util.Random" %>
<%@ page import="java.util.Date" %>
<html>
<body>
<h2>Hello World!</h2>
<br/>
<br/>
<br/>

<a href="/form">form</a>
<br/>
<a href="/all">all</a>
<br/>
<a>---------------------------------------------------</a>
<br/>
<a href="/form2">form2</a>
<br/>

<%
    Random rn = new Random();
    int a = rn.nextInt(100);
%>
<h2><%= new Date()%></h2>

</body>
</html>
