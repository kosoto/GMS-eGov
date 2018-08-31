<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
<!-- Navigation -->
    <nav class="navbar navbar-expand-lg bg-secondary fixed-top text-uppercase" id="mainNav">
      <div class="container">
        <a class="navbar-brand js-scroll-trigger" href="#page-top">Start Bootstrap</a>
        <button class="navbar-toggler navbar-toggler-right text-uppercase bg-primary text-white rounded" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          Menu
          <i class="fa fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item mx-0 mx-lg-1">
              <a id="logout" class="nav-link py-3 px-0 px-lg-3 rounded" >로그아웃</a>
            </li>
            <li class="nav-item mx-0 mx-lg-1">
              <a id="modify" class="nav-link py-3 px-0 px-lg-3 rounded" >정보수정</a>
            </li>
            <li class="nav-item mx-0 mx-lg-1">
              <a id="remove" class="nav-link py-3 px-0 px-lg-3 rounded" >회원탈퇴</a>
            </li>
            <li class="nav-item mx-0 mx-lg-1">
              <a id="mypage" class="nav-link py-3 px-0 px-lg-3 rounded mypage" >${member.name} 페이지</a>
            </li>
          </ul>
          <ul class="navbar-nav ml-auto">
            <li class="nav-item mx-0 mx-lg-1">
              <a id="board_write" class="nav-link py-3 px-0 px-lg-3 rounded" >게시글쓰기</a>
            </li>
            <li class="nav-item mx-0 mx-lg-1">
              <a id="board_list" class="nav-link py-3 px-0 px-lg-3 rounded" >게시글목록보기</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
</div>
<script>
$("#logout").click(function(){
	location.href = "${context}/member/logout";
});
$("#modify").click(function(){
	location.href = "${context}/move/enter/member/modify";
});
$('#remove').click(function(){
	location.href = "${context}/move/enter/member/remove";
});
$("#mypage").click(function(){
	location.href = "${context}/move/auth/member/retrieve";
});
$('#board_write').click(function(){
	location.href = "${context}/move/auth/board/register";
});
$('#board_list').click(function(){
	location.href = "${context}/move/auth/board/listAll";
});
</script>
