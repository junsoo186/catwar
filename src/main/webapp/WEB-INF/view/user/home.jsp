<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/home.css">
<link rel="stylesheet" href="fonts/font.css">
</head>
<body>
	<content>
	<div class="login-area">
		<h2>"${principal.name}"님 환영합니다.</h2>
	</div>
	<div class="home-navarea">
	<img  src="/images/background/musclecat.gif">
	<nav class="nav-boxing">
		<ul class="home-nav">
			<a onclick="loadNewGame()"><li>새게임<li></a> 
			<a href=""><li>이어하기<li></a> 
			<a href=""><li>설정<li></a> 
			<a href="/user/logout"><li>로그아웃<li></a>
		</ul>
	</nav>
	<img  src="/images/background/musclecat.gif">
	</div>
	</content>
</body>
</html>