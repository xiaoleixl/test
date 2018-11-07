<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>注册界面</h1>
	<span>${tips}</span>
	<form action="regist.do" method="post">
		用户名：<input type="text" name="username"/><br/>
		密码：<input type="password" name="pwd"/><br/>
		<input type="submit" value="注册"/>
	</form>
</body>
</html>