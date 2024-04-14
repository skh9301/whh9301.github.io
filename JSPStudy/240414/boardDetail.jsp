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
			<tr>
				<th>글쓴이</th>
				<td>${board.writer }</td>
				<th>작성일</th>
				<td>
				<fmt:formatDate value="${ board.regDate }"pattern="yyyy-MM-dd HH:mm:ss" />
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
					<input class="form-control" type="password" name="pass" id="pass">
				<th>조회수</th>
				<td>${board.readCount }</td>
			</tr>
			<tr>
				<th>파 일</th>
				<td colspan="3">
					<c:if test="${ empty board.file1 }">
					첨부파일 없음
						</c:if>
					<c:if test="${ not empty board.file1 }">
						<a href="upload/${ board.file1 }">파일 다운로드</a>
					</c:if>
				</td>
			</tr>
			<tr>
				<td colspan="4">
					<pre>${ board.content }</pre>
				</td>
			</tr>
		</table>
		</div>
		<div class="col-2"></div>
	</div>
	<div class= "row">
		<div class="col">
			<input class="btn btn-warning" type="button" id="detailUpdate" value="수정하기"/>
			&nbsp;&nbsp; <input class="btn btn-danger" type="button" id="detailDelete" value="삭제하기">
			&nbsp;&nbsp;<input calss = "btn btn-primary" type="button" value="목록보기" onclick="location.href='boardList'">			
		</div>
	</div>
	<!--footer 부분  -->
	
	<script src="bootstrap/bootstrap.bundle.min.js"></script>
</body>
</html>
