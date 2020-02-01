<%--
  Created by IntelliJ IDEA.
  User: grow
  Date: 2019/11/6
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${basePath}upload" method="post" enctype="multipart/form-data">
    <label>用户名：</label><input type="text" name="name"/><br/>
    <label>密 码：</label><input type="password" name="password"/><br/>
    <label>头 像</label><input type="file" name="file"/><br/>
    <input type="submit" value="提  交"/>
</form>
</body>
</html>
