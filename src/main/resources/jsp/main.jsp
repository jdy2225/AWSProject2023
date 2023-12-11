<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
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

        a {
            display: inline-block;
            padding: 10px 20px;
            margin: 10px;
            background-color: #428bca;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s;
        }

        a:hover {
            background-color: #3071a9;
        }
    </style>
</head>
<body>

<h1>Welcome to Your Application!</h1>

<%-- Provide styled links to different operations --%>
<p><a href="login.jsp">Login</a></p>
<p><a href="insert.jsp">Sign Up</a></p>
<p><a href="update.jsp">Update User</a></p>
<p><a href="delete.jsp">Delete User</a></p>

</body>
</html>

