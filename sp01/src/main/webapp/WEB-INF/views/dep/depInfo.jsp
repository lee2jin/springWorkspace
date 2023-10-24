<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 조회</title>
<script src="https://code.jquery.com/jquery-3.7.1.js"
	integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4="
	crossorigin="anonymous"></script>
</head>
<body>
	<form>
		<div>
			<label>department_id : <input type="text" name="departmentId"
				value="${depInfo.departmentId }" readonly></label>
		</div>
		<div>
			<label>department_name : <input type="text" name="departmentName"
				value="${depInfo.departmentName }"></label>
		</div>
		<div>
			<label>manager_id : <input type="text" name="managerId"
				value="${depInfo.managerId }" readonly></label>
		</div>
		<div>
			<label>location_id : <input type="text" name="locationId"
				value="${depInfo.locationId }"></label>
		</div>
		<div>
			<button type="button" onclick="location.href='depList'">목록으로</button>
		</div>
	</form>
</body>
</html>