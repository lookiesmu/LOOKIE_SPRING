<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>스프링 DB myBatis 연동!!</h1>
	<hr/>
	<hr/>
	
	<%String context = request.getContextPath();%>
	<hr/><h2>사용자 삭제</h2><br/>
	<form action="<%=context%>/delete" method="post">
		아이디 : <input type="text" name="userId" size="20"><br/>
		<input type="submit" value="회원 삭제">&nbsp;&nbsp;
		<input type="reset" value="다시입력"><hr/>
		
	</form>
	
	

</body>
</html>