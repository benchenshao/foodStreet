<%--
  Created by IntelliJ IDEA.
  User: benchenshao
  Date: 2017/10/23
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <img id="previewImg" src="images/preview.jpg" width="80" height="80"/>
    <form action="" method="post" enctype="multipart/form-data">
        请选择图片：<input type="file" name="picture"/>
        请输入账号：<input type="text" name="username"/>
        请输入密码：<input type="text" name="password"/>
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
