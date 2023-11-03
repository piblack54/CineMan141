<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giao diện đăng nhập</title>

<style>
    body {
        background-color: #ADD8E6; /* Xanh biển nhạt */
        text-align: center;
        font-family: Arial, sans-serif;
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
        background-color: #007FFF; /* Xanh biển sâu */
        color: #FFF;
        border: none;
        border-radius: 4px;
        padding: 10px 20px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #0056b3; /* Xanh biển đậm khi di chuột vào */
    }
</style>

</head>
<body style="text-align: center;">
    <h1>CINEMA LOGIN FORM</h1>
    <h2>login here</h2>

	<form action="login" method="post">
		Tên đăng nhập:  <br><input type="text" name="username"><br>
		Mật khẩu: <br> <input type="password" name="password"><br> <input
			type="submit" value="Đăng nhập">
	</form>
</body>
</html>