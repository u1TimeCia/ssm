<%--
  Created by IntelliJ IDEA.
  User: qhr74
  Date: 2020/9/10
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    success
    ${requestScope.get("msg")}
    ${sessionScope.get("msg")}
</body>
</html>
