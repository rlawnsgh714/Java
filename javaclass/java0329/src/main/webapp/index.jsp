<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link href="https://fonts.googleapis.com/css?family=Black+Han+Sans:400" rel="stylesheet">
    <style>
    *{
    	font-family: 'Black Han Sans',sans-serif;
    }
      .container {
        margin: 0 auto;
        width: 700px;
        background-color: #ccc;
      }
      ul {
        list-style: none;
      }
      li {
        display: inline;
      }
      a {
        background-color: lime;
        display: inline-block;
        margin: 1rem;
        padding: 1rem;
        text-decoration: none;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <ul>
        <li><a href="ex01.jsp">1번 insert</a></li>
        <li><a href="select.jsp">2번 select</a></li>
        <li><a href="">3번 delete</a></li>
        <li><a href="">4번 update</a></li>
      </ul>
    </div>
  </body>
</html>
