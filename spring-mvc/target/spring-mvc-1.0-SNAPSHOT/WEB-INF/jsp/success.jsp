<%--
  Created by IntelliJ IDEA.
  User: grow
  Date: 2019/11/6
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("basePath", basePath);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<img src="${basePath}${imagesPath}" width="200px" height="200">
</body>
</html>
