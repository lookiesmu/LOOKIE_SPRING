<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
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

<a href="/lec/board/create">글 작성하기(create)</a><br/>
<a href="/lec/board/read">글 불러오기(read)</a><br/>
<a href="/lec/board/delete">글 삭제하기(delete)</a><br/>
<a href="/lec/board/update">글 수정하기(update)</a><br/>
<a href="/lec/board/listAll">글 목록 전체 조회하기(listAll)</a><br/>

</body>
</html>
