<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="bootstrap/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="bootstrap/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<!-- 헤더부분 -->
	<!--중간  -->
	<div class="row">
		<div class="col-3"></div>
		<div class="col-8">
			<h2>게시 글 상세보기</h2>
		</div>
		<div class="col-3"></div>
	</div>
	<div class="row">
		<div class="col-2"></div>
		<div class="col-8">
		<table class="table">
			<tr>
				<th>제 목</th>
				<td colspan="3">${board.title}</td>
			</tr>
		</table>
		</div>
		<div class="col-2"></div>
	</div>
	
	<script src="bootstrap/bootstrap.bundle.min.js"></script>
</body>
</html>
