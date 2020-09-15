<%--
  Created by IntelliJ IDEA.
  User: qhr74
  Date: 2020/9/13
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript"  src="/js/jquery-1.7.2.min.js"></script>
    <script>
        //绑定单击事件
        $(function () {
            $("#btn").click(function () {
                alert("hello btn");
            });
        });
    </script>
</head>
<body>
<a href="user/testString">testString</a>
<a href="user/testVoid">testVoid</a>
<a href="user/testModelAndView">testModelAndView</a>
<a href="user/testForwardOrRedirect">testForwardOrRedirect</a>
<button id="btn">发送ajax的请求</button>
</body>
</html>

