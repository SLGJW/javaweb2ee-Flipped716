package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");//����ҳ����ʾ�ı���
		request.setCharacterEncoding("utf-8");//�������ݴ�������ı���
		/*
		 * ���ݽ���
		 * */
		String user = request.getParameter("user");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		PrintWriter out = response.getWriter();
		/*
		 * ������ʾ
		 * */
		out.println("<html>");
		out.println("<body>");
		out.println("������"+user+"<br>");
		out.println("���䣺"+age+"<br>");
		out.println("��ַ��"+address+"<br>");
		//��������get��ʽ���д���
		out.println("<a href= 'getServlet?user="+user+"&age="+age+"&address="+address+"'>����Ҵ�������</a>");
		out.println("</body>");
		out.println("</html>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}