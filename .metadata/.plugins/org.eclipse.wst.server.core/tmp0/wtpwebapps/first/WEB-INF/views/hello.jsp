<%@page import="mvcAnnotation.HelloDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>컨트롤러로부터 받은 메세지 </h1>
<%
HelloDTO dto = (HelloDTO)request.getAttribute("model"); 
%>
<h3>자바스크립트 태그 = <%=dto.getMessage() %></h3>
</body>
</html>