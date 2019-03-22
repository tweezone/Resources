<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>new jsp</title>
</head>
<body>
	<center>
		<form action="<%=basePath %>/front/login.action" method="post">
			<p>用户名：<input type="text" name="username"></p>
			<p>密&nbsp;码：<input type="password" name="password"></p>
			<p>
				<input type="submit" value="登录">
				<input type="reset" value="重置">
			</p>
		</form>
	</center>
</body>
</html>