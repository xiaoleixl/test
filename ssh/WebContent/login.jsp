<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>登录界面</h1>
	<a href="regist.jsp">立即注册</a>
	<form action="login.do" method="post">
		用户名：<input type="text" name="username"/><br/>
		密码：<input type="password" name="pwd"/><br/>
		<input type="submit" value="登录"/>
	</form>
</body>
</html>