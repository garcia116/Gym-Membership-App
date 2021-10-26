package root;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginSuccess")
public class LoginSuccess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSuccess() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://gym-membership.c6q06qjku7s5.us-east-1.rds.amazonaws.com/SJSU_gym", "admin", "sjsucmpe172");
			PreparedStatement ps = conn.prepareStatement("select * from member where email=? and password=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
		    String destPage = "login.html";
			
			if(rs.next()) {
				if(rs.getString("password").equals(password)&&rs.getString("email").equals(email))
				{
				String dbEmail = rs.getString("email");
				HttpSession session = request.getSession();
				session.setAttribute("email", dbEmail);
				destPage= "loginSuccess.jsp";
				}
			} else {
				PrintWriter out = response.getWriter();
				out.println("query not executed");

			}
			RequestDispatcher req = request.getRequestDispatcher(destPage);
			req.forward(request, response);
		
		} catch (SQLException | ClassNotFoundException ex) {
			throw new ServletException(ex);
		}
		

}
}
