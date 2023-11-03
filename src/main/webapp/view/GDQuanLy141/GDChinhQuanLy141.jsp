<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Quản Lý</title>
<link href="./view/style/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>Trang chủ quản lý</h1>
	<h1>
		Xin chào
		<%=request.getParameter("username")%></h1>



	<h2>Lên lịch chiếu:</h2>
	<form action="listLC" method="post">
		<button>Lên lịch chiếu</button>
		<input type="hidden" name="username"
			value="<%=request.getParameter("username")%>">
	</form>
</body>
</html>
