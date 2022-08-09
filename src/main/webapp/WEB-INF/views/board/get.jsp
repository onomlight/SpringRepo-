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
	<script type="text/javascript" src="/resources/js/reply.js"> </script>
</head>


<body>

	<div id="wrapper" class="container-md">
		<div id="top-header">
		</div> 
		<div id="nav">
			<%@include file="/resources/includes/nav.jsp" %>
		</div>
		
		
		<div style="display:flex;justify-content:space-between;">
	       	<!-- 글보기 화면 처리  -->
	        <div id="contents" class='w-50'>
			
				<h1>Board Read Page</h1>		 
					<input class="form-control mt-2" name="title" placeholder="title" value=${board.title} readonly>			 
					<textarea name="content" class="form-control mt-2"  readonly>${board.content} </textarea>
					<input class="form-control mt-2" name="writer"  placeholder="writer" value=${board.writer} readonly>
					<input type=button value="글수정" class="btn btn-primary mt-2" 
					onclick="javascript:location.href='/board/modify?bno=${board.bno}'">
					 
					<input type=button value="리스트" class="btn btn-primary mt-2 move">			 
	        </div>
	         <!-- 댓글처리  -->
			<div  style=width:600px;> 	
	        	<br><br>
	        	<!-- COMMENT -->
	        	<div id=comment>
	        		<textarea class="form-control"  id=cmt placeholder="댓글입력 하세요" style=height:100px;></textarea>
	        	</div>
	        	<div>
	        		<a id=replybtn class="btn btn-primary mt-3">댓글달기</a>
	        	</div>
	        	<!-- INFO -->
	        	<div class="mt-3">
	        	댓글수 : <span id=rcnt></span>
	        	</div>
	        	<!-- REPLYList -->
	        	<div class="chat mt-3"  style='height:310px;overflow:auto;'>
	        		<div class='unit form-control' data-rno="1">    		
		        		<!-- unit -->
			        	 	
			        			<div class='r-header' >
			        			<strong class='primary-font'>USER00</strong>
			        			<small class='rdate text-muted'>2022-01-01 13:13</small>	
			        		</div>
			        		<div class='r-body'>
			        				REPLY TEST		
			        		</div> 
			        	
	        		</div>
	        	</div>
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
		<script>
$(document).ready(function(){
			
			
			var bnoValue = ${board.bno};
			var replyUL = $(".chat");
			
			 
			showlist(1);	
			function showlist(page){		
				replyService.getList
				(
						{bno:bnoValue,page: page||1},
						function(list){
							str="";
							
							if(list==null || list.length==0)
							{
								replyUL.html("");
								return ;
							}
							for(i=0,len=list.length||0;i<len;i++){
								str+="<div class='unit form-control' data-rno="+list[i].rno+" >";
								str+="<div class='r-header' >";
								str+="<strong class='primary-font'>"+list[i].replyer+"</strong>";
								str+="<small class='rdate text-muted'>"+replyService.displayTime(list[i].replyDate)+"</small>";								
								str+="</div>";
								str+="<div class='r-body'>";
								str+="</div>"+list[i].reply+"</div>";
							} 
							replyUL.html(str);
						} //익명 함수 끝
				);	//getList 끝	
			}//showlist 끝	
			
		}) //document.ready 끝
		
		</script>
	</div>
</body>
</html>