package kodlamaioDemo.dataAccess.hibernate;

import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Course Hibernate eklendi." + course.getCourseName());
	}

	@Override
	public void update(Course course) {
		System.out.println("Course Hibernate güncellendi." + course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Course Hibernate silindi." + course.getCourseName());
		
	}

}
