<%--
  Created by IntelliJ IDEA.
  User: benchenshao
  Date: 2017/10/23
  Time: 8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%= basePath%>"/>
    <title>登录界面</title>
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/jquery.validate.js"></script>
    <script src="js/jquery.validate.unobtrusive.js"></script>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/form.css" />
</head>
<body>
    <form id="userform" class="form-inline" action="login.action" method="post">
        <p>
            <label for="username">用户名：</label>
            <input id="username" class="form-control" style="width:400px;margin-left:35px;" name="username" type="text" data-val="true" data-val-required="请输入用户名"/>
            <span data-valmsg-for="username" data-valmsg-replace="true"></span>
        </p>
        <p>
            <label for="password">密码：</label>
            <input id="password" class="form-control" style="width:400px;margin-left:50px;" name="password" type="text" data-val="true" data-val-required="请输入密码"/>
            <span data-valmsg-for="password" data-valmsg-replace="true"></span>
        </p>
        <input type="submit" value="登录"/>
    </form>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>
