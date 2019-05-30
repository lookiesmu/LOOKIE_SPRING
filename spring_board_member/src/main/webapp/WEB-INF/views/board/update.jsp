<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>게시판 수정하기</h1>
	
	<form method="POST">
        <div class="createForm">
            <label>수정 할 글 번호</label>
            <input type="text" name="bNo" class="createForm">
        </div>
        <div class="createForm">
            <label>제목</label>
            <input type="text" name="bTitle" class="createForm" placeholder = "글 제목">
        </div>
            내용<div class="createForm"> 
            <textarea rows="40" cols="60" name="bContent" class="createForm" placeholder = "글 내용"></textarea>
        </div>
        <div class="Formfooter">
                <button type="submit" class="btn_button">글 수정</button>
        </div>            

    </form> 
	

</body>
</html>