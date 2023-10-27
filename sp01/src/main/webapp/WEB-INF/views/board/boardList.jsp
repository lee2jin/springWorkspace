<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
		   <c:forEach items="${boardList}" var="info">
			<tr onclick="location.href='boardInfo?bno=${info.bno}'">
				<td>${info.bno }</td>
				<td>${info.title }</td>
				<td>${info.writer }</td>
				<td>
				<fmt:formatDate value="${info.regdate }" pattern="yyyy년MM월dd일" /> 
				</td>
			</tr>
		   </c:forEach>		
		</tbody>
	</table>
</body>
</html>