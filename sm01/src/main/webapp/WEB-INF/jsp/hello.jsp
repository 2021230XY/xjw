<%--
  Created by IntelliJ IDEA.
  User: 86183
  Date: 2021/11/26
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@page pageEncoding="UTF-8" isErrorPage="false" contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>hello</title>
</head>
<body>

<%--<h1>你好，${sessionScope.name}我叫光之国</h1>--%>
<%--<h1>hello,${requestScope.msg}</h1>--%>
<%--<h1>hello,${requestScope.username}</h1>--%>
<h1>hello,${sessionScope.user.username}</h1>
<div>
    <p>${CRUDmsg}</p>
    <a href="${pageContext.request.contextPath}/user/welcome">返回欢迎页</a>
</div>

<div>

    <form action="${pageContext.request.contextPath}/param1/upload" enctype="multipart/form-data" method="post">
        上传图片1：<input type="file" name="images"><br>
        上传图片2：<input type="file" name="images"><br>
        上传图片3：<input type="file" name="images"><br>
        <input type="submit" value="上传">
    </form>
</div>
</body>
</html>
