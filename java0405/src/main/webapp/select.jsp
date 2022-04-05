<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ex0405.MemberDBManager" %>
<%@ page import="ex0405.member" %>
<%@ page import="java.util.List" %>

<% 
	MemberDBManager member = new MemberDBManager();
	List<member> list = member.doInsert();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./myStyle.css" rel="stylesheet">
</head>
<body>
<%@ include file="nav.jsp"%>
<div class="main">
<h1>select 페이지</h1>
	
	<table class="table">
		<tr>
			<th>ID</th><th>usrname</th><th>password</th>
		</tr>
		<% 
			for(Member member: list) {
			
			%>
		<tr>
			<td><%=member.getId() %></td>
			<td><%out.println(member.getUsrname()); %></td>
			<td><%=member.getPassword() %></td>
		</tr>
			
		<% 
			}
		%>
	</table>
</div>
</body>
</html>