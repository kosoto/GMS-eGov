<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<section id="portfolio">
	<h2>사용자 로그인</h2>	
	<form id="loginForm" name="loginForm">
		ID <br>
		<input type="text" name="memberId" ><br>
		Pass <br>
		<input type="text" name="pass"  ><br>
		<input type="hidden" name="action" value="login"/>
		<input id="login_btn" type="button" value="제출"/>
	</form><br>
</section>
<script>
$("#login_btn").click(()=>{
	$("#loginForm").attr({
		action:"${context}/member/login",
		method:"POST"
	}).submit();
});
</script>

