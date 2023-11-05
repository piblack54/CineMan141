<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giao diện đăng nhập</title>

<style>
    body {
        font-family: "Poppins", sans-serif;
    	background-color: #f0f0f0;
    	text-align: center;
    	font-weight: 300;
    	font-size: 15px;
    	color: black;
    }

    h1, h2 {
        color: #333; /* Màu văn bản chính */
    }

    form {
        margin: 0 auto;
        max-width: 300px;
        padding: 100px;
        background-color: #FFFFFF; /* Màu nền của biểu mẫu */
        border-radius: 5px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
    }

    input[type="text"],
    input[type="password"] {
        width: 100%;
        margin: 8px 0;
        padding: 12px 20px;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="submit"] {
        background-color: #ffeba7;
    	color: #102770;
    	height: 44px;
    	border: none;
    	border-radius: 4px;
    	padding: 0px 30px;
    	cursor: pointer;
    	margin-right: 5px;
    	letter-spacing: 1px;
    	display: inline-flex;
    	justify-content: center;
    	text-align: center;
    	box-shadow: 0 8px 24px 0 rgba(255, 235, 167, 0.2);
    }

    input[type="submit"]:hover {
        background-color: #102770;
    	color: #ffeba7;
    	box-shadow: 0 8px 24px 0 rgb(16, 39, 112, 0.2);
    }
</style>

</head>
<body style="text-align: center;">
    <h1>CINEMA LOGIN FORM</h1>
    <h2>login here</h2>

	<form action="login" method="post">
		USERNAME:  <br><input type="text" name="username"><br>
		PASSWORD: <br> <input type="password" name="password"><br> <input
			type="submit" value="Đăng nhập">
	</form>
</body>
</html>