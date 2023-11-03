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
	<h1>Trang Chủ Khách Hàng</h1>
	<h1>
		Xin chào
		<%=request.getParameter("username")%></h1>
	
	
	<h2>Tìm thông tin phim</h2>
	<form action="search" method="post">
		<button>Tìm thông tin phim</button>
		<input type="hidden" name="username"
			value="<%=request.getParameter("username")%>">
	</form>
</body>
</html>