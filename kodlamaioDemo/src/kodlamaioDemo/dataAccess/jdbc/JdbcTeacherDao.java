package kodlamaioDemo.dataAccess.jdbc;

import kodlamaioDemo.dataAccess.TeacherDao;
import kodlamaioDemo.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("Teacher JDBC eklendi" + teacher.getTeacherFirstName());
		
	}

	@Override
	public void update(Teacher teacher) {
		System.out.println("Teacher JDBC eklendi" + teacher.getTeacherFirstName());
		
	}

	@Override
	public void delete(Teacher teacher) {
		System.out.println("Teacher JDBC eklendi" + teacher.getTeacherFirstName());
		
	}

}
