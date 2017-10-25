<%--
  Created by IntelliJ IDEA.
  User: benchenshao
  Date: 2017/10/23
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%= basePath%>"/>
    <title>Title</title>
</head>
<body>
<h1>操作失败！！！</h1>
<a href="jsp/register.jsp">返回注册页面</a>
<a href="jsp/login.jsp">返回登录页面</a>
<a href="jsp/index.jsp">返回主页面</a>
<s:fielderror></s:fielderror>
</body>
</html>
