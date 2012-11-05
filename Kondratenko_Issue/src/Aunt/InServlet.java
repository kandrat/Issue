package Aunt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InServlet
 */
public class InServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        // Генерим страницу ввода логина и пароля и передаем в LogiServ
		response.setContentType("text/Html charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<title>Welcome</title>");
		out.println("<form action=LogiServ>");
		out.println("<table><tr>");
		out.println("<td>Login:</td>");
		out.println("<td><input type= text name= 'login'></td>");
		out.println("</tr>");
		out.println("<tr><td>Password:</td>");
		out.println("<td><input type=Password name='pass'></td></tr>");
		out.println("<tr><td colspan=2>");
		out.println("<input type=submit value=Enter/></td>");
		out.println("</tr></table></form>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
