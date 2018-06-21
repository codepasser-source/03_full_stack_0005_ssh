<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>index.jsp</title>
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
    <h1 align="center">Spring-整合Hibernate</h1> <br>
    <div align="center">
   		 <form action="user_addUser.action" method="post" > 
         		     用户密码：<input type="text" name="user.password"><br>
         		     用户名：<input type="text" name="user.username"><br>
         		     权限:<input type="text" name="user.role.id" value="0000"><br>
					  <input type="submit" value="添加"> <input type="reset" value="重置">
    	</form> 
    </div>
  </body>
</html>
