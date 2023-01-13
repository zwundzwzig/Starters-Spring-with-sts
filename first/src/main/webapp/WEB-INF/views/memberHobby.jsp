<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="member" method=post>  
아이디<input type=text name="id" value=""><br>
암호<input type=password name="pw"><br>
나이<input type=number name="age"><br>
<input type=checkbox name="hobby" value="음악">
<input type=checkbox name="hobby" value="영화">
<input type=checkbox name="hobby" value="게임">
<input type=checkbox name="hobby" value="공부">
<input type=submit value="내 정보 입력">
</form>
</body>
</html>