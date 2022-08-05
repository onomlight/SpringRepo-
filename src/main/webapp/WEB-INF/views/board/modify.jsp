<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/resources/includes/link.jsp" %>
	<div id="contents">
		<h1>Board Modify Page</h1>
		
		<form action="/board/register" method="post">
			<input class = "form-control mt-2" name="title" placeholder="title" value=${board.title}>
			
			<textarea name="content" class="form-control mt-2">${board.content}</textarea>
			<input class="form-control mt-2" name="writer" placeholder="writer" value=${board.writer}>
			<input type="submit" data-oper='modify' value="글수정" class="btn btn-primary mt-2">
			<input type="submit" data-oper='remove' value="글삭제" class="btn btn-primary mt-2">
			<input type="submit" data-oper='list' 	value="리스트" class="btn btn-primary mt-2">
		
			<input type="hidden" name="bno" value=${board.bno}>
			<input type="hidden" name="regDate" value='<fmt:formatDate pattern="yyyy/MM/dd" value="${board.regdate}"/>'>
		</form>
	
	</div>
	<script>
		$(document).ready(function () {
			$("input[type='submit']").on("click",function(e)){
				e.preventDefault(); // 기본 submit 기능 해제
				let operation = $(this).data("oper");
				if(operation==="remove"){
					$('form').attr("action","/board/remove");
				}else if(operation==='list'){
					
					self.location = "/board/list";
					return;
				}
				$('form').submit();
			}
		})
		
	</script>


</body>
</html>