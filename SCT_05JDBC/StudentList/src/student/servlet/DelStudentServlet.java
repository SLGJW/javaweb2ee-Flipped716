package student.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;

import student.utils.DataSourceUtils;

public class DelStudentServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String sname = request.getParameter("sname");
		Connection conn;
		try {
			conn = DataSourceUtils.getConnection();
			QueryRunner runner = new QueryRunner();
			String sql ="DELETE FROM student WHERE sname=?";
			runner.update(conn,sql, sname);
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		response.getWriter().write("ɾ���ɹ�!!!<a href='studentlist'>������Ϣ�б�ҳ��</a>");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}