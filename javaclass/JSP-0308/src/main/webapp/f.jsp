<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	<script scr="https://ajax.googleapis.com/ajax/Libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$('#div0').on('click', function(){alert('빨강');  })
		});
		function show(){
			$('#div0').show();
		}
		function hide(){
			$('#div0').hide();
		}
	</script>
</style>
</head>
<body>
<%
	for(int i=0;i<3;i++){
		out.println("<div id=\"div" + i + "\"></div>");
	}
%>

</body>
</html>
<script type="text/javascript">
	document.getElementById("div0").onclick=function(){alert('빨강'); }
	document.getElementById("div1").onclick=function(){alert('파랑'); }
	document.getElementById("div2").onclick=function(){alert('노랑'); }
</script>