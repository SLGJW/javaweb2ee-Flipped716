package student.sevice;

import java.sql.SQLException;
import java.util.List;

import student.dao.StudentDao;
import student.domain.Student;

public class StudentService {

	public List<Student> SelectAllStudent() throws SQLException {
		// TODO �Զ����ɵķ������
		StudentDao dao = new StudentDao();
		return dao.SelectAllStudent();
	}

	public int updatestudent(String sname,String sid) throws SQLException {
		StudentDao dao = new StudentDao();
		return dao.updatestudent(sname ,sid );
		
	}

	public  int Delstudent(String sname) throws SQLException {
		// TODO �Զ����ɵķ������
		StudentDao dao = new StudentDao();
		return dao.Delstudent(sname);
	}

	public int Addstudent(String sid, String sname, String sbirthday, String ssex) throws SQLException {
		// TODO �Զ����ɵķ������
		StudentDao dao = new StudentDao();
		return dao.Addstudent(sid,sname,sbirthday,ssex);
	}

	public List<Student> SelectStudent(String sname) throws SQLException {
		// TODO �Զ����ɵķ������
		StudentDao dao = new StudentDao();
		return dao.SelectStudent(sname);
	}

}
