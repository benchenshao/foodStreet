<%--
  Created by IntelliJ IDEA.
  User: benchenshao
  Date: 2017/10/23
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%= basePath%>"/>
    <title>注册页面</title>
    <script type="text/javascript" src="js/jquery-1.11.1.js"></script>
</head>
<body><%--
<form action="upload.action" method="post" enctype="multipart/from-data">
    请选择图片：<input id="upload" type="file" name="upload"/><br>
    &lt;%&ndash;请输入账号：<input type="text" name="username"/><br>
    请输入密码：<input type="text" name="password"/><br>&ndash;%&gt;
    <input type="submit" value="注册"/>${result}
</form>--%>

<form action="upload.action" method="post" enctype="multipart/form-data">
    请选择图片：<input type="file" name="upload"><br>
    请输入账号：<input type="text" name="username"/><br>
    请输入密码：<input type="text" name="password"/><br>
    <input type="submit" value="注册">${result}
</form>
</body>
</html>
