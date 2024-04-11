<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="bootstrap/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<!--header  -->
		<%@ include file = "../pages/header.jsp" %>
		<!-- content -->
		<div class="row my-5" id="global-content">
			<div class="col">
				<div class="row text-center">
					<div class="col">
						<h2 class="fs-3 fw-bold">게시 글 상세보기</h2>
					
				<div class="row my-3">
					<div class="col">
						<table class="table table-bordered">
							<tbody>
								<tr>
									<th>제 목</th>
									<td colspan="3">${board.title}</td>
								</tr>
								<tr>
									<th>글쓴이</th>
									<td>${board.writer}</td>
									<th>작성일</th>
									<td><fmt:formatDate value="${board.regDate}" 
										pattern="yyyy-MM-dd HH:mm" /></td>
								</tr>
								<tr>
									<th>비밀번호</th>
									<td>
										<div class="col-8">
											<input class="form-control" type="password" name="pass" id="pass" >
										</div>
									</td>
									<th>조회수</th>
									<td>${board.readCount}</td>
								</tr>
								<tr>
									<th>파 일</th>
									<td colspan="3">
										<c:if test="${empty board.file1}">
											첨부파일 없음
										</c:if>
										<c:if test="${not empty board.file1}">
											<a href="upload/${board.file1}">파일 다운로드</a>
										</c:if>
									</td>
								</tr>
								<tr>
									<td colspan="4" style="white-space: pre">${ board.content }</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				</div>
				</div>
				<div class="row my-3">
					<div class="col text-center">
						<input type="button" class="btn btn-warning" id="detailUpdate" value="수정하기">
						&nbsp;&nbsp;
						<input type="button" class="btn btn-danget" id="detailDelete" value="삭제하기">
						&nbsp;&nbsp;
						<input type="button" class="btn btn-primary"  value="목록보기" onclick="location.href='boardLIst'">
					</div>
				</div>
			</div>
		</div>
		<!--footer  -->
		<%@ include file = "../pages/footer.jsp" %>
		<script src="bootstrap/bootstrap.bundle.min.js"></script>
	</div>
</body>
</html>
