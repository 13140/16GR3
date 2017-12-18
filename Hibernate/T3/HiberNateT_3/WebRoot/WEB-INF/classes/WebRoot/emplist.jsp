<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'emplist.jsp' starting page</title>
    
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
  	<h1>员工管理</h1>
    <a href='<s:url url value='/emp!toAdd'></s:url>'>新增员工</a>
    <table border="1">
   			<tr>
   				<td>ID</td>
   				<td>姓名</td>
   				<td>性别</td>
   				<td>生日</td>
   				<td>所属部门</td>
   				<td>操作</td>
   			</tr>
   			
   			<s:iterator value="list" var="info">
	   			<tr>
	   				<td><s:property value="#info.eid"/> </td>
	   				<td><s:property value="#info.ename"/></td>
	   				<td><s:property value="#info.esex"/></td>
	   				<td><s:property value="#info.birthday"/></td>
	   				<td><s:property value="#info.dept.deptname"/></td>
	   				<td>
	   				<a href="<s:url value='/emp!toupdate?info.eid=%{#info.eid}'/>">修改</a>
					<a href="<s:url value='/emp!delete?info.eid=%{#info.eid}'/>">删除</a>
					</td>
	   			</tr>
   			</s:iterator>
   		</table>
  </body>
</html>
