<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Document</title>
	
	<%@include file="/resources/includes/link.jsp" %>
</head>


<body>

	<div id="wrapper" class="container-md">
		<div id="top-header">
		</div> 
		<div id="nav">
			<%@include file="/resources/includes/nav.jsp" %>
		</div>
		<div id="contents">
			<!-- 글보기 화면 처리  -->
			<h1>Board Read Page</h1>
			<input class = "form-control mt-2" name="title" placeholder="title" value=${board.title } readonly>
			
			<textarea name="content" class="form-control mt-2" readonly>${board.content }</textarea>
			<input class="form-control mt-2" name="writer" placeholder="writer" value=${board.writer } readonly>
			<input type="submit" value="글수정" class="btn btn-primary mt-2"
			onclick="javascript:location.href='/board/modify?bno=${board.bno}'">
			
			<input type="button" value="리스트" class="btn btn-primary mt-2 move">
		</div>
		<form name="operform" action="/board/list" method="get">
			<input type="hidden" name="bno" value=${board.bno }>
			<input type="hidden" name="pageNum" value=${cri.pageNum }>
			<input type="hidden" name="amount" value=${cri.amount }>
			<input type="hidden" name="type" value=${cri.type }>
			<input type="hidden" name="keyword" value=${cri.keyword }>
			
		</form>
		<script>
			$(document).ready(function () {
				form = document.operform;
				
				$(".move").on("click",function(){
					form.submit();
				})
			})
		</script>
	</div>
</body>
</html>