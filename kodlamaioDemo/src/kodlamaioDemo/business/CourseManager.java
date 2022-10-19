package kodlamaioDemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	public CourseDao courseDao;
	public Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	List<Course> courses = new ArrayList<>();
	
	public void add(Course course) throws Exception {
		if (course.getUnitPrice() < 0) {
			throw new Exception("Kurs ücreti sıfır olamaz");
		}
		for (Course crs : courses) {
			if (crs.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs ismi aynı olamaz");
			}

		}
		courseDao.add(course);
		courses.add(course);
		for (Logger logger : loggers) {
			logger.Log(course.getCourseName() + "  " + course.getUnitPrice());

		}
		

	}
	
	public void update(Course course) {
		this.courseDao.update(course);
		for (Logger logger : loggers) {
			logger.Log(course.getCourseName() + " " + course.getUnitPrice());

		}
	}
	public void delete (Course course) {
		this.courseDao.update(course);
		for(Logger logger: loggers) {
			logger.Log(course.getCourseName() + " " + course.getUnitPrice());
			
		}
		
	}

}
