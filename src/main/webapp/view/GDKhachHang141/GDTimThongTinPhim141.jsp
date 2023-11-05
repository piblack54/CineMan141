<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Khách Hàng</title>
<link href="./view/style/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>Trang chủ Khách Hàng</h1>
	<h1>
		Xin chào
		<%=request.getParameter("username")%></h1>
	

	<h2>Nhập tên phim:</h2>
	<form action="searchFilm" method="post">
		Tên phim: <input type="text" name="FilmName"> 
		<input type="hidden" name="username" value="<%=request.getParameter("username")%>">
		<input type="submit" value="Tìm kiếm">
	</form>
	<form action="backpagetrangchu" method="post">
		<button>Quay lại</button>
		<input type="hidden" name="username"
			value="<%=request.getParameter("username")%>">
	</form>
</body>
</html>