<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서목록</title>
<style>
  table {
    width: 100%;
    border: 1px solid #444444;
    border-collapse: collapse;
  }
  th, td {
    border: 1px solid #444444;
    padding: 10px;
  }
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>표지</th>
				<th>출판일자</th>
				<th>금액</th>
				<th>출판사</th>
				<th>도서소개</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${bookList}" var="info">
				<tr onclick="location.href='bookInfo?bookNo=${info.bookNo}'">
					<td>${info.bookNo }</td>
					<td>${info.bookName }</td>

					<c:choose>
						<c:when test="${not empty info.bookCoverimg}">
							<td>
							<img src="<c:url value="/resources/images/${info.bookCoverimg }"/>" 
							     style="width: 200px;"></td>
						</c:when>
						<c:otherwise>
							<td>파일없음</td>
						</c:otherwise>
					</c:choose>


					<td>${info.bookCoverimg }</td>
					<td><fmt:formatDate value="${info.bookDate }"
							pattern="yyyy/MM/dd" /></td>
					<td>${info.bookPrice }</td>
					<td>${info.bookPublisher }</td>
					<td>${info.bookInfo }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>