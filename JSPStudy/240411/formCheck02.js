// jQurry로 이용한  js

//JQurry를 이용한 함수
$(function(){
	
	$("#writeForm").on("submit",function(e){
		if($("#writer").val().trim().length <=0){
			alert("작성자를 입력해주세요");
			//e.preventDfault() + e.stopPropagation()
			$("#writer").val("");
			$("#writer").focus();
			
			return false
			
		}
		if($("#title").val().trim().length <=0){
			alert("제목을 입력해주세요");
			//e.preventDfault() + e.stopPropagation()
			$("#title").val("");
			$("#title").focus();
			
			return false
		}
		if($("#pass").val().trim().length <=0){
			alert("비밀번호를 입력해주세요");
			//e.preventDfault() + e.stopPropagation()
			$("#pass").val("");
			$("#pass").focus();
			return false
		}
		if($("#content").val().trim().length <=0){
			alert("내용을 입력해주세요");
			//e.preventDfault() + e.stopPropagation()
			$("#content").val("");
			$("#content").focus();
			return false
		}
	});
	
})
