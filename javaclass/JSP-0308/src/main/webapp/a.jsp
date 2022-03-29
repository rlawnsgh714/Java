<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style type="text/css">
        div{
            margin: 10px;
            padding: 10px;
        }
        #adiv{
            background-color: green;
        }
        #bdiv{
            background-color: red;
        }
    </style>
</head>
<body>
<div id="adiv">
    <form action="b.jsp">
        아이디<input type="text" name="id">
        비번<input type="text" name="pw">
        <input type="submit" value="전송">
    </form>
</div>
<div id="bdiv">
    두개의 넣기
    <form action="calcu.jsp">
        숫자: <input type="text" name="num1"><br>
        숫자: <input type="text" name="num2"><br>
        <input type="submit" value="전송">
    </form>
</div>
</body>
</html>