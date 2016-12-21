<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<script type="text/javascript" src="javascript/jquery-3.1.0.js"></script>  
</head>
<body>
		
		 
		
		<table border="1">
			<tbody>
				<tr>
					<td>序号</td>
					<td>姓名</td>
					<td>年龄</td>
				</tr>
				<c:if test="${!empty listUser }">
					<c:forEach items="${listUser }" var="list">
						<tr>
							<td>${list.id }</td>
							<td>${list.userName }</td>
							<td>${list.age }</td>
						</tr>
					
					</c:forEach>
					
				
				</c:if>
			</tbody>
		</table>
		
</body>
</html>