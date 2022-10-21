package Day03ArchitectKodlamaio;

import Day03ArchitectKodlamaio.business.CategoryManager;
import Day03ArchitectKodlamaio.business.CourseManager;
import Day03ArchitectKodlamaio.business.InstructorManager;
import Day03ArchitectKodlamaio.core.logging.DatabaseLogger;
import Day03ArchitectKodlamaio.core.logging.FileLogger;
import Day03ArchitectKodlamaio.core.logging.Logger;
import Day03ArchitectKodlamaio.core.logging.MailLogger;
import Day03ArchitectKodlamaio.dataAccess.Category.HibernateCategoryDao;
import Day03ArchitectKodlamaio.dataAccess.Course.HibernateCourseDao;
import Day03ArchitectKodlamaio.dataAccess.Course.JdbcCourseDao;
import Day03ArchitectKodlamaio.dataAccess.Instructor.JdbcInstructorDao;
import Day03ArchitectKodlamaio.entities.Category;
import Day03ArchitectKodlamaio.entities.Course;
import Day03ArchitectKodlamaio.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new DatabaseLogger(), new MailLogger(), new FileLogger()};
		
		Course course1 = new Course(1,"Java Programlama", 1);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers);
		courseManager.add(course1);
		
		System.out.println("-----------------------");
		
		Category category1 = new Category(1,"Yazılım Kursları","Kurs");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		
		System.out.println("-----------------------");
		
		Instructor instructor1 = new Instructor(4,"Engin ","Demiroğ");
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor1);
		System.out.println(instructor1);
		

	}

}
