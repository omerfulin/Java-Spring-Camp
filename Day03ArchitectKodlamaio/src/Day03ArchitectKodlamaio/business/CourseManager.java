package Day03ArchitectKodlamaio.business;

import java.util.Iterator;
import java.util.List;

import Day03ArchitectKodlamaio.core.logging.Logger;
import Day03ArchitectKodlamaio.dataAccess.Course.CourseDao;
import Day03ArchitectKodlamaio.dataAccess.Course.HibernateCourseDao;
import Day03ArchitectKodlamaio.dataAccess.Course.JdbcCourseDao;
import Day03ArchitectKodlamaio.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getPrice() < 0) {
			throw new Exception("Kursun Fiyatı 0'dan küçük olamaz");		
		}
		
		if(course.courseName.equals(course.courseName)) {
			throw new Exception("Kurs ismi tekrar edemez. ");
		}
		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

}
