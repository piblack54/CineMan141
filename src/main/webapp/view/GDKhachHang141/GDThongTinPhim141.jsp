<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thông tin tìm kiếm</title>
<link href="./view/style/style.css" rel="stylesheet" type="text/css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
	integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
	integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
	crossorigin="anonymous"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
</head>
<h1>Kết quả tìm kiếm</h1>
<body style="text-align: center;">
	<table class="table table-bordered">
		<thead class="table-dark">
			<tr>
				<th scope="col">FilmID</th>
				<th scope="col">FilmName</th>
				<th scope="col">Thao tác</th>
			</tr>
		</thead>
		<tbody class="table-group-divider">
			<c:forEach items="${listS}" var="o">
				<tr>
					<td class="text-center">${o.getFilmID()}</td>
					<td class="text-center">${o.getFilmName()}</td>
					<td class="text-center">
						<form action="viewDetailFilm" method="post">
							<input type="hidden" name="FilmID" value="${o.getFilmID()}">
							<input type="submit" value="Xem Chi Tiết" class="btn btn-success">
						</form>

					</td>

				</tr>
			</c:forEach>

		</tbody>
	</table>
	<form action="backpagetrangTimkiemphim" method="post">
		<button>Quay lại</button>
		<input type="hidden" name="username"
			value="<%=request.getParameter("username")%>">
	</form>
</body>
</html>