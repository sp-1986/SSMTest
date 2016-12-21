<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h4> hello word</h4>
		<a href="<%=basePath%>/user/getAllUser">user PAGE</a>
		<br><br>
		<a href="<%=basePath%>/user/getUserById?id=1">uer id page</a>
		<br><br>
		
		<form action="user/testPojo" method="post">
			
		
		</form>
</body>
</html>