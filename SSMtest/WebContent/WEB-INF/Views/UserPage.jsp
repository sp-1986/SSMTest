<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="javascript/jquery-3.1.0.js"></script>  
</head>
<body>
		<h4>user page</h4>
		
		<table>
			<tr>
				<td>id</td>
				<td>name</td>
				<td>age</td>
			</tr>
			
			<tr>
				<td>${user.id }</td>
				<td>${user.userName }</td>
				<td>${user.age }</td>
			</tr>
		</table>
</body>
</html>