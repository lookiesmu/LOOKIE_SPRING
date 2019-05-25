<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="UTF-8">
	<title>title</title>
</head>
<body>
	
	<h1>스프링 DB myBatis 연동!!</h1>
	<hr/>
	<hr/>
	<%String context = request.getContextPath();%>
	<h1>profile DB 데이터 전체출력</h1>
	<form action="<%=context%>/listAll" method="post">
		<input type="submit" value="사용자 목록 출력">
	</form>
	
</body>
</html>
