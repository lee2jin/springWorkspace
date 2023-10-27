<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="bookInsert" method="post">
		<div>
			도서 번호<input type="text" name="bookNO">
		</div>
		<div>
			도서명<input type="text" name="bookName">
		</div>
		<div>
			도서표지<input type="text" name="bookCoverimg">
		</div>
		<div>
			출판일자<input type="text" name="bookDate" placeholder="yyyy/MM/dd">
		</div>
		<div>
			금액<input type="text" name="bookPrice">
		</div>
		<div>
			출판사<input type="text" name="bookPublisher">
		</div>
		<div>
			도서소개<input type="text" name="bookInfo">
		</div>
		<button>등록</button>
		<button>조회</button>
	</form>

	

</body>
</html>