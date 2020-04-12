package demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		String user = request.getParameter("user");
		String old = request.getParameter("old");
		String password = request.getParameter("address");
		response.getWriter().write("–’√˚£∫"+user+"<br>");
		response.getWriter().write("ƒÍ¡‰£∫"+old+"<br>");
		response.getWriter().write("µÿ÷∑£∫"+password+"<br>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}
}