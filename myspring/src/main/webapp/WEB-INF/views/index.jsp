<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String context = request.getContextPath(); %>
<form action="<%=context%>/list" method="post">
	<input type="text" name="memberId">
	<input type="submit" value="idcheck"> 
</form>
</body>
</html>