<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
	public void doA(){
		System.out.println("asdfasdf");
	}
	
	public String doB(){
		return "doB";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		doA(); 
		out.println(doB());
	%>
</body>
</html>