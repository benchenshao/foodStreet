<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/21 0021
  Time: 下午 7:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>$Title$</title>
      <script src="js/jquery-1.10.2.js"></script>
      <script src="js/jquery.validate.js"></script>
      <script src="js/jquery.validate.unobtrusive.js"></script>
      <link href="css/bootstrap.min.css" rel="stylesheet">
      <link rel="stylesheet" href="css/form.css" />
  </head>
  <body>

        <form id="userform" class="form-inline" action="">
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
            <p>
                <label for="Repeatpassword">重复密码：</label>
                <input id="Repeatpassword" class="form-control" style="width:400px;margin-left:22px;" name="Repeatpassword" type="text" data-val="true" data-val-required="请输入重复的密码" data-val-equalto="密码和确认密码不匹配。" data-val-equalto-other="password"/>
                <span data-valmsg-for="Repeatpassword" data-valmsg-replace="true"></span>
            </p>
            <p>
                <label for="email">邮箱：</label>
                <input id="email" class="form-control" style="width:400px;margin-left:50px;" name="email" type="text" data-val="true" data-val-required="<img src='images/chacha.jpg' width='20' height='20'>" data-val-email="请输入正确的邮箱"/>
                <span data-valmsg-for="email" data-valmsg-replace="true"></span>
            </p>
            <p>
                <label for="age">年龄：</label>
                <input id="age" class="form-control" style="width:400px;margin-left:50px;" name="age" type="text" data-val="true" data-val-required="<div class='glyphicon glyphicon-remove'></div>" data-val-number="请输入正确的数字" data-val-length="请输入0-200之间的岁数a" data-val-length-max="3" data-val-range="请输入0-200之间的岁数b" data-val-range-min="0" data-val-range-max="200"/>
                <span data-valmsg-for="age" data-valmsg-replace="true"></span>
            </p>
            <p>
                <label for="regex">手机：</label>
                <input type="text" class="form-control" style="width:400px;margin-left:50px;" id="regex" name="regex" data-val="true" data-val-required="不能为空！" data-val-regex="手机格式不正确" data-val-regex-pattern="(13[0-9]|15[012356789]|18[0236789]|14[57])[0-9]{8}"/>
                <span data-valmsg-for="regex" data-valmsg-replace="true"></span>
            </p>
            <p>
                <input id="tijiao" class="btn btn-default" name="tijiao" type="submit"/>
            </p>
        </form>






        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>
  </body>
</html>
