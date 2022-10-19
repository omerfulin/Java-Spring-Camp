package kodlamaioDemo.dataAccess.jdbc;

import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Course JDBC eklendi" + course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Course JDBC güncellendi." + course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course JDBC silindi." + course.getCourseName());
		
	}

}
