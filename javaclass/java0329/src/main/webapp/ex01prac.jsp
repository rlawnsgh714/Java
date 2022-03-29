<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="member.DriverTest" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <%
    	String user = request.getParameter("username");
    	String pw = request.getParameter("password");
    	out.println("user = " + user);
    	out.println("pw = " + pw);
    	DriverTest dt = new DriverTest();
    	String ret = dt.doInsert(user, pw);
    	if(ret.equals("suc"))
    		response.sendRedirect("index.jsp");
    	else
    		out.println("insert 실패");
    %>
  </body>
</html>
