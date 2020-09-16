<%--
  Created by IntelliJ IDEA.
  User: qhr74
  Date: 2020/9/14
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">test</a>
    <br/>
    <form action="account/save" method="post">
        name:<input type="text" name="name">
        money:<input type="text" name="money">
        <input type="submit" value="save">
    </form>
</body>
</html>
