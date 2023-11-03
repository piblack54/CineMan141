package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DB.DBConnection;
import model.Phim141;

public class ThongTinChiTietPhimDao141 {
	public Phim141 getThongTinChiTietPhimDao141(String IDFilm){
		Phim141 phim = new Phim141();
		 
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = DBConnection.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM tblphim141 WHERE FilmID = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, IDFilm);
			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();

			// Bước 4:
			if (rs.next()) {
				
				int FilmID = rs.getInt("FilmID");
				String FilmVersion = rs.getString("FilmVersion");
				int Time = rs.getInt("Time");
				String FilmName = rs.getString("FilmName");
				String Description = rs.getString("Description");
				
			
				phim =  new Phim141(FilmID, FilmVersion, Time, FilmName, Description);
				System.out.println(phim +" DAO");

			}

			// Bước 5:
			DBConnection.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return phim;
	}
}
