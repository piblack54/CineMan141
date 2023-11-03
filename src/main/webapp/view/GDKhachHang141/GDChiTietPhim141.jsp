<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Chi tiết món ăn</title>
    <link href="./view/style/style.css" rel="stylesheet" type="text/css">
</head>
<body>
    <h1>Thông Tin Chi Tiết Phim</h1>
    <c:if test="${not empty phim}">
    	<p>ID: ${phim.filmID}</p>
        <p>Thể loại phim: ${phim.filmVersion}</p>
        <p>Thời lượng: ${phim.time} phut</p>
        <p>Tên phim: ${phim.filmName}</p>
        <p>Mô tả: ${phim.description}</p>
        <!-- Thêm các thông tin khác tương tự -->
    </c:if>
</body>
</html>
