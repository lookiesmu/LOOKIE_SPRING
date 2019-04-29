<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>memJoinOk</h1>
	
	<%--
	MemberController의 memjoin 메소드의 매개변수가 "Model model, HttpServletRequest request" 일때 아래처럼 작성
	ID : ${memId}<br/>
	PW : ${memPw}<br/>
	Mail : ${memMail}<br/>
	Phone : ${memPhone1} - ${memPhone2} - ${memPhone3}<br/>
	 --%>
	
	
	<%-- 
	MemberController의 memjoin 메소드의 매개변수가 "Member member" 일때 아래처럼 작성
	--%>
	ID : ${member.memId}<br/>
	PW : ${member.memPw}<br/>
	Mail : ${member.memMail}<br/>
	Phone : ${member.memPhone1} - ${member.memPhone2} - ${member.memPhone3}<br/>
	
		
	<a href="/le/resources/html/memJoin.html">memJoin.html로 이동</a>

</body>
</html>