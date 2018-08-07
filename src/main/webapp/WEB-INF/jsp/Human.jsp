<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OHF HumanFactor Monitor Center</title>
</head>
<body>
 	<h1>人因测试参数信息</h1>
 	<table border="1" width="600">
 		<tr>
 			<td>编号</td>
 			<td>姓名</td>
 			<td>性别</td>
 			<td>生日</td>
 			<td>心率</td>
 			<td>气压</td>
 			<td>备注</td>
		<c:forEach var="human" items="${list }">
		<tr>
			<td>${ human.id }</td>
			<td>${ human.name }</td>
			<td>${ human.sex }</td>
			<td><fmt:formatDate value="${ human.birthday }" pattern="yyyy-MM-dd"/></td>
			<td>${ human.heartRate }</td>
			<td>${ human.kpa }</td>
		</tr>		
		</c:forEach>
 		</tr>
 	</table>
</body>
</html>