<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete User</title>
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

        .message {
            margin-top: 20px;
            font-weight: bold;
        }

        .success {
            color: #3c763d;
        }

        .error {
            color: #a94442;
        }
    </style>
</head>
<body>

<h1>회원 탈퇴</h1>

<%-- 성공 및 실패 메시지 표시 --%>
<% if (request.getAttribute("success") != null) { %>
    <div class="message <%= (boolean)request.getAttribute("success") ? "success" : "error" %>">
        <%= (boolean)request.getAttribute("success") ? "삭제 성공!" : "삭제 실패!" %>
    </div>
<% } %>

<form action="/AWSProject/delete" method="post">
    <label for="id">User ID:</label>
    <input type="text" id="id" name="id" required>
    <button type="submit">회원 탈퇴</button>
</form>

</body>
</html>
