<%--
  Created by IntelliJ IDEA.
  User: qhr74
  Date: 2020/9/11
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="anno/testRequestParam?name=qhr">testRequestParam</a>

    <br>
        <form action="anno/testRequestBody" method="post">
            username: <input type="text" name="uname"><br/>
            user age: <input type="text" name="age"><br/>
            birthday: <input type="text" name="date"><br/>
            <input type="submit" value="提交">
        </form>
    <br>
    <a href="anno/testPathVariable/10">testPathVariable</a>
    <br>
    <form action="anno/testModelAttribute" method="post">
        username: <input type="text" name="uname"><br/>
        user age: <input type="text" name="age"><br/>
        <input type="submit" value="提交">
    </form>
    <a href="anno/testSessionAttribute">testPathVariable</a>
    <a href="anno/testDeleteSession">testPathVariable</a>

</body>
</html>
