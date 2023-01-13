<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<img src="<%=request.getContextPath() %>/resources/images/americano.jpg">
<script src="<%=request.getContextPath() %>/resources/js/jquery-3.6.1.min.js"></script>
<h1>log in form</h1>
<form action="<%=request.getContextPath() %>/login" method="post">
id : <input type=text name="id"/><br />
pw : <input type=password name="pw"/><br />
age : <input type=number name="age"/><br />
<input type="submit" value="login"/><br />
</form>
</body>
</html>