package kodlamaioDemo;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.TeacherManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.EmailLogger;
import kodlamaioDemo.core.logging.FileLogger;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.hibernate.HibernateCategoryDao;
import kodlamaioDemo.dataAccess.hibernate.HibernateCourseDao;
import kodlamaioDemo.dataAccess.hibernate.HibernateTeacherDao;
import kodlamaioDemo.dataAccess.jdbc.JdbcCategoryDao;
import kodlamaioDemo.dataAccess.jdbc.JdbcCourseDao;
import kodlamaioDemo.dataAccess.jdbc.JdbcTeacherDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };

		Teacher teachers = new Teacher("Engin", "Demiroğ");
		TeacherManager teachersManager = new TeacherManager(new JdbcTeacherDao(), loggers);
		teachersManager.add(teachers);
		teachers.setTeacherFirstName("Engin");
		teachersManager.update(teachers);
		System.out.println();

		Category category1 = new Category("Programlamalar");
		Category category2 = new Category("Senior");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.update(category1);
		categoryManager.delete(category2);
		System.out.println();

		Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı JAVA", 1000);
		Course course2 = new Course("Senior Yazılım Geliştirici Yetiştirme Kapmpı .NET", 2000);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		System.out.println();

		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.update(course1);
		courseManager.delete(course2);

	}

}
