<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="study.dao.BoardDao"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="bootstrap/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="bootstrap/bootstrap.min.css" rel="stylesheet">
</head>
<body>
</body>
</html>
<!--헤더 조회라인  -->
<div class="row">
	<div class="col-2">
	</div>
	<div class="col-4">
	<!-- 로고-->
	</div>
	<div class="col-1">
	</div>
	<div class="col-5">
	<!-- 링크 -->
	</div>
</div>
<!--게시판 리스트 라인  -->
<div class="row">
	<div class="col-3"></div>
	<div class="col-6">
		<h2 class="text-center my-4 fs-2 fw-bolder">게시판 리스트</h2>
	</div>
	<div class="col-3"></div>
</div>
<form name ="searchForm" id="searchFrom" action="#" class="row justify-content-center  my-3">
<div class="row justify-content-center my-3">
	<div class="col-auto">
		<select name="type" class="form-select">
			<option value="title">제 목</option>
			<option value="writer">작성자</option>
			<option value="content">내용</option>
		</select>
	</div>
	<div class="col-4">
		<input type="text" name="keyword" class="form-control" id="keyword">
	</div>
	<div class="col-auto">
		<input type="submit" value="검 색" class="btn btn-primary">
	</div>
</div>
</form>
	<div class="row my-3">
		<div class="col-2"></div>
		<div class="col text-end">
			<a href="writeForm" class="btn btn-outline-success">글쓰기</a>
		</div>
		<div class="col-2"></div>
	</div>
<div class="row my-3">
	<div class="col-2"></div>
	<div class="col-8">
		<table class="table table-hover table-bordered">
			<thead>
			<tr class="table-primary text-center">
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>날짜</th>
				<th>조회수</th>
			</tr>
			</thead>
			<tbody >
			<c:forEach var="board" items="${list }">
				<tr>
					<td class="text-center">${board.no }</td>
					<td><a href="boardDetail?no=${board.no}">${board.title}</a></td>
					<td class="text-center">${board.writer}</td>
					<td class="text-center">${board.regDate}</td>
					<td class="text-center">${board.readCount}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="col-2"></div>
</div>
<script src="bootstrap/bootstrap.bundle.min.js"></script>
</body>
</html>
