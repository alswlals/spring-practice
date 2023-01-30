﻿<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page import="com.douzone.emaillist.vo.EmaillistVo"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메일 리스트에 가입되었습니다.</h1>
	<p>입력한 정보 내역입니다.</p>
	
	<c:forEach items="${list }" var="vo">
	<table border="1" cellpadding="5" cellspacing="2">
			<tr>
				<td align=right>성: </td>
				<td>${vo.getFirstName() }</td>
			</tr>
			<tr>
				<td align=right width="110">이름: </td>
				<td width="110">${vo.getLastName()  }</td>
			</tr>
			<tr>
				<td align=right>이메일: </td>
				<td>${vo.getEmail() }</td>
			</tr>
		</table>
		<br>
	</c:forEach>

		
	
	<p>
		<a href="${pageContext.request.contextPath }/add">새 메일 등록</a>
	</p>
	<br>
</body>
</html>