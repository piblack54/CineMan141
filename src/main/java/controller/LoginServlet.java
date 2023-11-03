package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Đường dẫn kết nối đến cơ sở dữ liệu MySQL
    private static final String JDBC_URL = "jdbc:mysql://localhost/pttk141";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "root";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Lấy thông tin đăng nhập từ biểu mẫu
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            // Kết nối đến cơ sở dữ liệu MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);

            // Truy vấn SQL kiểm tra thông tin đăng nhập
            String query = "SELECT * FROM tbltaikhoan141 WHERE TenDangNhap = ? AND MatKhau = ?";
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Lấy vai trò của người dùng từ cơ sở dữ liệu
                String role = resultSet.getString("VaiTro");

                if ("KhachHang".equals(role)) {
                    // Đăng nhập thành công với vai trò KhachHang, điều hướng đến trang của khách hàng
                    request.getRequestDispatcher("view/GDKhachHang141/GDChinhKhachHang141.jsp").forward(request, response);
                } else if ("QuanLy".equals(role)) {
                    // Đăng nhập thành công với vai trò QuanLy, điều hướng đến trang quản lý
                    request.getRequestDispatcher("view/GDQuanLy141/GDChinhQuanLy141.jsp").forward(request, response);
                } else {
                    // Không có vai trò phù hợp, điều hướng đến trang lỗi
                    request.getRequestDispatcher("view/add/error.jsp").forward(request, response);
                }
            } else {
                // Đăng nhập không thành công, điều hướng đến trang lỗi
                request.getRequestDispatcher("view/add/error.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}