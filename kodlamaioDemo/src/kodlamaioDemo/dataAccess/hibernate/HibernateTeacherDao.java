package kodlamaioDemo.dataAccess.hibernate;

import kodlamaioDemo.dataAccess.TeacherDao;
import kodlamaioDemo.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao{

	@Override
	public void add(Teacher teacher) {
		System.out.println("Teacher Hibernate eklendi." + teacher.getTeacherFirstName() + " " + teacher.getTeacherLastName());
		
	}

	@Override
	public void update(Teacher teacher) {
		System.out.println("Teacher Hibernate güncellendi." + teacher.getTeacherFirstName() + " " + teacher.getTeacherLastName());
		
	}

	@Override
	public void delete(Teacher teacher) {
		System.out.println("Teacher Hibernate silindi." + teacher.getTeacherFirstName() + " " + teacher.getTeacherLastName());
		
	}

}
