package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import dao.Phim141Dao;
import model.Phim141;

/**
 * Servlet implementation class SearchFilmServlet
 */
@WebServlet(name = "searchFilm", urlPatterns = {"/searchFilm"})
public class SearchFilmServlet extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //b1: get data from dao
        String FilmName = request.getParameter("FilmName");
        System.out.println(FilmName);
        Phim141Dao std = new Phim141Dao();
        
        ArrayList<Phim141> listS = new ArrayList<Phim141>();

        
        listS = std.getTTPhim141(FilmName);
        for (Phim141 i : listS) {
        	System.out.println(i);
        }
        request.setAttribute("listS", listS);
        request.getRequestDispatcher("view/GDKhachHang141/GDThongTinPhim141.jsp").forward(request, response);
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
