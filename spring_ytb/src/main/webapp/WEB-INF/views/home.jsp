<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

	contextPath + <br/>
	1) 사용자 검색 : /s<br/>
	2) 사용자 입력 : /i<br/>
	3) 사용자 삭제 : /d<br/>
	4) 사용자 변경 : /u<br/>
	5) 사용자 목록출력 : /a<br/>
	
	
</body>
</html>
