<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="b-example-divider"></div>

	<header class="p-3 mb-3 border-bottom">
		<div class="container">
			<div
				class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
				<a href="/"
					class="d-flex align-items-center mb-2 mb-lg-0 link-body-emphasis text-decoration-none">
					<svg class="bi me-2" width="40" height="32" role="img"
						aria-label="Bootstrap">
						<use xlink:href="#bootstrap" /></svg>
				</a>

				<ul
					class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
					<li><a href="${pageContext.request.contextPath }/"
						class="nav-link px-2 link-secondary">Home</a></li>
					<li><a href="${pageContext.request.contextPath }/empList"
						class="nav-link px-2 link-body-emphasis">전체사원조회</a></li>
					<li><a href="${pageContext.request.contextPath }/empInsert"
						class="nav-link px-2 link-body-emphasis">사원정보등록</a></li>
					<li><a href="#" class="nav-link px-2 link-body-emphasis">Disabled</a></li>
				</ul>

				<form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
					<input type="search" class="form-control" placeholder="Search..."
						aria-label="Search">
				</form>
			</div>
		</div>
	</header>
</body>
</html>