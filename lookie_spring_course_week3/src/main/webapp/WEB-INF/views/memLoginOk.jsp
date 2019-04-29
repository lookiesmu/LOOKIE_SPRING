<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>memLoginOk</h1>
	ID : <%=request.getParameter("memId")%><br/>
	PW : <%=request.getParameter("memPw")%><br/>
	
	<a href="/le/resources/html/index.html">메인페이지로 이동</a>

</body>
</html>