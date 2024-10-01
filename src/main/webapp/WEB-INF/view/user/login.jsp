<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="css/login.css">
<link rel="stylesheet" href="fonts/font.css">

</head>
<body>
 	<div class="loginform">
      <label for="email">이메일:</label>
    <input type="email" id="email" required>

    <label for="password">비밀번호:</label>
    <input type="password" id="password" required>

     <button onclick="login()">로그인</button>
    </div>
  
</body>
</html>