<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'show.jsp' starting page</title>
    
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
    	<table align="center" width="50%">
    		<tr align="center">
    			<th>部门编号</th>
    			<th>部门名称</th>
    			<th>部门地址</th>
    		</tr>
    		
    		<c:forEach items="${requestScope.deptList}" var="dept" varStatus="stat">
    			<c:if test="${stat.count%2==1}">
    				<tr align="center" style="background-color: gray" >
    			</c:if>
    			<c:if test="${stat.count%2==0}">
    				<tr align="center">
    			</c:if>
    			
    				<td>${dept.id}</td>
    				<td>${dept.name}</td>
    				<td>${dept.loc}</td>
    			</tr>
    		</c:forEach>
	
    	</table>
		<a href="add.jsp">添加</a>


  </body>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
</html>
