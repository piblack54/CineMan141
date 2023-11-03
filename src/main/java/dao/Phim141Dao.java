package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DB.DBConnection;
import model.Phim141;

public class Phim141Dao {
	public ArrayList<Phim141> selectAll(){
		ArrayList<Phim141> ketQua = new ArrayList<Phim141>();
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = DBConnection.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM pttk141.tblphim141";
			PreparedStatement st = con.prepareStatement(sql);

			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();

			// Bước 4:
			while (rs.next()) {
				
				int FilmID = rs.getInt("FilmID");
				String FilmVersion = rs.getString("FilmVersion");
				int Time = rs.getInt("Time");
				String FilmName = rs.getString("FilmName");
				String Description = rs.getString("Description");
				
			
				Phim141 Phim141 =  new Phim141(FilmID, FilmVersion, Time, FilmName, Description);
				System.out.println(Phim141 +" DAO");
				ketQua.add(Phim141);
				
			}

			// Bước 5:
			DBConnection.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Phim141 b:ketQua) {
			/* System.out.println(b); */
		}
		return ketQua;
	}
	
	
	public ArrayList<Phim141> getTTPhim141(String name) {
	    ArrayList<Phim141> ketQua = new ArrayList<Phim141>();
	    try {
	        // Bước 1: Tạo kết nối đến CSDL
	        Connection con = DBConnection.getConnection();

	        // Bước 2: Tạo đối tượng PreparedStatement với câu SQL có điều kiện tìm kiếm theo tên
	        String sql = "SELECT * FROM pttk141.tblphim141 WHERE FilmName LIKE ?";
	        PreparedStatement st = con.prepareStatement(sql);
	        
	        // Thiết lập tham số name vào câu SQL và sử dụng wildcard '%' để tìm kiếm tất cả các phim có tên chứa chuỗi name
	        st.setString(1, "%" + name + "%");

	        // Bước 3: Thực thi câu lệnh SQL
	        System.out.println(sql);
	        ResultSet rs = st.executeQuery();

	        // Bước 4: Lặp qua kết quả tìm kiếm
	        while (rs.next()) {
	        	int FilmID = rs.getInt("FilmID");
				String FilmVersion = rs.getString("FilmVersion");
				int Time = rs.getInt("Time");
				String FilmName = rs.getString("FilmName");
				String Description = rs.getString("Description");
				
			
				Phim141 Phim141 =  new Phim141(FilmID, FilmVersion, Time, FilmName, Description);
				System.out.println(Phim141 +" DAO");
				ketQua.add(Phim141);
	        }

	        // Bước 5: Đóng kết nối CSDL
	        DBConnection.closeConnection(con);
	    } catch (SQLException e) {
	        // Xử lý ngoại lệ nếu có lỗi
	        e.printStackTrace();
	    }
	    for (Phim141 b : ketQua) {
			/* System.out.println(b); */
	    }
	    return ketQua;
	}

	
}
