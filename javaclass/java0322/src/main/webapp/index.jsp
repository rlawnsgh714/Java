<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <style>
      ::content {
        margin: 0 auto;
        width: 600px;
        background-color: #ccc;
      }
      ul {
        list-style: none;
      }
      li {
        display: inline;
        background-color: lime;
      }
      a {
        display: inline-block;
        margin: 1rem;
        text-decoration: none;
      }
    </style>
  </head>
  <body>
    <div class="container">
      <ul>
        <li><a href="ex01.jsp">1번 insert</a></li>
        <li><a href="ex01.jsp">2번 select</a></li>
        <li><a href="ex01.jsp">3번 insert</a></li>
        <li><a href="ex01.jsp">4번 insert</a></li>
      </ul>
    </div>
  </body>
</html>
