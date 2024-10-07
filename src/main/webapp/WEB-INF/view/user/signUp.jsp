<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/signup.css">
<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="fonts/font.css">
</head>
<body>
 	<div class=signup-area>
 	<h1>회원가입</h1>
 	<div>
    	<input type="name" id="name" required placeholder="이름">
    </div>
    <div>	
    	<input type="email" id="email" required placeholder="이메일">
    </div>
    <div>	
	    <input type="password" id="password" required placeholder="비밀번호">
	</div>
 	<div onclick="userSignUp()" class="btn-signUp">가입</div>
 	</div>
</body>
</html>