<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f4f4f4;
            margin: 50px;
        }

        h1 {
            color: #333;
        }

        form {
            max-width: 300px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 15px;
            box-sizing: border-box;
        }

        button {
            background-color: #428bca;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        button:hover {
            background-color: #3071a9;
        }
    </style>
</head>
<body>

<h1>로그인</h1>

<%-- 성공 메시지 표시 --%>
<% if (request.getAttribute("success") != null && (boolean) request.getAttribute("success")) { %>
    <div style="color: #3c763d; margin-bottom: 15px;">로그인 성공!</div>
<% } %>

<form action="/AWSProject/login" method="post">
    <label for="id">사용자 ID:</label>
    <input type="text" id="id" name="id" required>
    <label for="password">비밀번호:</label>
    <input type="password" id="password" name="password" required>
    <button type="submit">로그인</button>
</form>


</body>
</html>