package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ThongTinChiTietPhimDao141;
import model.Phim141;

/**
 * Servlet implementation class viewDetailFilm
 */
@WebServlet(name = "viewDetailFilm", urlPatterns = {"/viewDetailFilm"})
public class viewDetailFilm extends HttpServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //b1: get data from dao
        String FilmID = request.getParameter("FilmID");
        System.out.println(FilmID);
        ThongTinChiTietPhimDao141 std = new ThongTinChiTietPhimDao141();
        
        Phim141 phim = new Phim141();

        
        phim = std.getThongTinChiTietPhimDao141(FilmID);
        request.setAttribute("phim", phim);
        System.out.println("Controller " + phim);
        request.getRequestDispatcher("view/GDKhachHang141/GDChiTietPhim141.jsp").forward(request, response);
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}
