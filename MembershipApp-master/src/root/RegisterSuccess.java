package root;


import java.io.IOException;
import java.io.*;
import java.sql.*;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterSuccess
 */
@WebServlet("/RegisterSuccess")
public class RegisterSuccess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterSuccess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String date = request.getParameter("date");
		String gender = request.getParameter("gender");
		String membership = request.getParameter("membership");
		String address = request.getParameter("address");
		String password = request.getParameter("password");

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://gym-membership.c6q06qjku7s5.us-east-1.rds.amazonaws.com/SJSU_gym", "admin", "sjsucmpe172");
			PreparedStatement ps = conn.prepareStatement("insert into member (fname,lname,email,phone,date,gender,membership,address, password) VALUES (?,?,?,?,?,?,?,?,?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, phone);
			ps.setString(5, date);
			ps.setString(6, gender);
			ps.setString(7, membership);
			ps.setString(8, address);
			ps.setString(9, password);
			
			
			int x  = ps.executeUpdate();
			if(x > 0) {
				RequestDispatcher req = request.getRequestDispatcher("RegisterSuccess.html");
				req.include(request, response);
				
			} else {
				RequestDispatcher req = request.getRequestDispatcher("register.html");
				req.forward(request, response);
			}
			conn.close();
		} catch(Exception e){
		PrintWriter out = response.getWriter();
			out.println(e);
		}

}}
