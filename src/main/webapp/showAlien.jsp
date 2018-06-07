<%@ page import="com.sahaluddin.model.Alien" %><%--
  Created by IntelliJ IDEA.
  User: Faris
  Date: 5/23/2018
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Love Java</title>
</head>
<body bgcolor="#adff2f">

    <h1 style="text-align: center">Ci Luk Ba </h1>

    <%
        Alien a1 = (Alien)session.getAttribute("alien");

        out.print(a1);
    %>

</body>
</html>
