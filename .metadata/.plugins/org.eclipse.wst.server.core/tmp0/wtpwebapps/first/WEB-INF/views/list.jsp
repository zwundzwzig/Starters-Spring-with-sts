<%@page import="mvcAnnotation.ListDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>get List </h1>
<%-- <c:forEach items="${model }" varStatus="dto"/> --%>
<%
ListDTO dto = (ListDTO)request.getAttribute("model"); 
%>
<h3>자바스크립트 태그 = <%=dto.toString() %></h3>
<h3>el 태그 = ${requestScope.model.list } </h3>
</body>
</html>