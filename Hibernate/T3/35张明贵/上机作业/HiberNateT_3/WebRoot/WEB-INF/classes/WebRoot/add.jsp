<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <s:form action="emp!add" method="post">
    	<s:textfield name="info.ename" label="姓名"/>
    	<s:radio list="#{'M':'男','F':'女' }" name="info.esex" value="'M'" label="性别"/>
    	
    	<s:select name="info.did" list="list" listKey="deptid" listValue="deptname" label="所属部门"></s:select>
    	
    	
    	<s:textfield name="info.birthday" label="出生日期"/>
    	<s:submit value="新增 "></s:submit>
    </s:form>
    
    
    
    
    
    
    
    
  </body>
</html>
