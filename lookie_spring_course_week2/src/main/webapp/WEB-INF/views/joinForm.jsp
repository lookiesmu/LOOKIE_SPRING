<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>회원가입</title>
</head>
<body>

	<%
		response.setCharacterEncoding("UTF-8");
	%>

	<form action="joinOk.jsp" method="post">
		아이디 : <input type="text" name="id" size="20"><br/>
		비밀번호 : <input type="password" name="pw" size="20"><br/>
		성별 : 
		<input type="radio" name="gender" value="mail" checked="checked">남
		<input type="radio" name="gender" value="femail">여<br/>
		어학능력 :
		<input type="checkbox" name="speak" value="english">영어
		<input type="checkbox" name="speak" value="japaness">일본어
		<input type="checkbox" name="speak" value="chiness">중국어
		<hr/>
		
		<input type="submit" value="회원가입">
		<input type="reset" value="다시입력"><br/>
		
	</form>

</body>
</html>
