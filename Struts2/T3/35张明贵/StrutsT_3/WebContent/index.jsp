<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>StrutsT_3</h3>
	<s:set name="uname" value="'qq'"></s:set>
	<br />
	***********************
	<br />
	
	<s:property value="#name" />
	<br />
	<s:set name="books" value="{'eee','sef','1212','1.2'}"></s:set>
	<br />
	<s:property value="#books[1]" />
	
	<form action="">
		用户名:<input type="text" name="user.uname"><br />
		密码:<input type="password" name="user.upwd"><br />
		年龄:<input type="text" name="user.age"><br />
		生日:<input type="text" name="user.birthday" >
		性别:<input type="text" name="user.sex"><br />
		地址:<input type="text" name="user.address"><br />
		手机号:<input type="text" name="user.telphone" ><br />
		<input type="submit" value="注册" >
	</form>
</body>
</html>