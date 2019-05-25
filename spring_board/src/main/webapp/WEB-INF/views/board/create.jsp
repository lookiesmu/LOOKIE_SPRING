<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
    <title>게시판</title>
</head>
<body>

<h1>게시판 작성하기</h1>
 
    <form method="POST">
        <div class="createForm">
            <label>제목</label>
            <input type="text" name="bTitle" class="createForm" placeholder = "글 제목">
        </div>
            내용<div class="createForm"> 
            <textarea rows="40" cols="60" name="bContent" class="createForm" placeholder = "글 내용"></textarea>
        </div>
        <div class="createForm">
            <label>작성자</label>
            <input type="text" name="bWriter" class="createForm" placeholder = "작성자">
        </div>
        <div class="Formfooter">
                <button type="submit" class="btn_button">글작성</button>
        </div>            

    </form> 
    
</body>
</html>
