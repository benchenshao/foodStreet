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
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/jquery.validate.js"></script>
    <script src="js/jquery.validate.unobtrusive.js"></script>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/form.css" />
</head>
<body>

<form action="upload.action" method="post" enctype="multipart/form-data">
    请选择图片：<input type="file" name="upload"><br>
    <input type="submit" value="上传图片"/>${result}
</form>

<form id="userform" class="form-inline" action="uploadregister.action" method="post">
    <p>
        <label for="username">用户名：</label>
        <input id="username" class="form-control" style="width:400px;margin-left:35px;" name="username" type="text" data-val="true" data-val-required="请输入用户名"/>
        <span data-valmsg-for="username" data-valmsg-replace="true"></span>
    </p>
    <p>
        <label for="password">密码：</label>
        <input class="form-control" style="width:400px;margin-left:50px;" id="password" name="password" type="text" data-val="true" data-val-required="请输入密码" data-val-length-max="100" data-val-length-min="6" data-val-length="密码至少包含6个字符串。"/>
        <span data-valmsg-for="password" data-valmsg-replace="true"></span>
    </p>
    <p>
        <label for="password1">重复密码：</label>
        <input class="form-control" style="width:400px;margin-left:22px;" id="password1" name="password1" type="text" data-val="true" data-val-required="请输入重复的密码" data-val-equalto="密码和确认密码不匹配。" data-val-equalto-other="password"/>
        <span data-valmsg-for="password1" data-valmsg-replace="true"></span>
    </p>
    <p>
        <label for="phone">手机：</label>
        <input type="text" class="form-control" style="width:400px;margin-left:50px;" id="phone" name="phone" data-val="true" data-val-required="手机号码不能为空！" data-val-regex="手机格式不正确" data-val-regex-pattern="(13[0-9]|15[012356789]|18[0236789]|14[57])[0-9]{8}"/>
        <span data-valmsg-for="phone" data-valmsg-replace="true"></span>
    </p>
    <p>
        <label for="checkcode">验证码：</label>
        <input type="text" class="form-control" style="width:400px;margin-left:35px;" id="checkcode" name="checkcode" data-val="true" data-val-required="验证码不能为空！" data-val-regex="验证码不正确"/>
        <img alt="checkcode" id="checkcodeimage" src=""/>
        <span data-valmsg-for="checkcode" data-valmsg-replace="true"></span>
    </p>
    <br>
    <input type="submit" value="注册">
</form>


    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>
