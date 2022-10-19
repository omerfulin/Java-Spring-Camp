package kodlamaioDemo.business;


import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.TeacherDao;
import kodlamaioDemo.entities.Teacher;

public class TeacherManager {
	public TeacherDao teacherDao;
	public Logger[] logger;
	public TeacherManager(TeacherDao teacherDao, Logger[] loggers) {
		this.teacherDao = teacherDao;
		this.logger = loggers;
	}
	
	public void add (Teacher teacher) {
		this.teacherDao.add(teacher);
		for (Logger logger : logger) {
			logger.Log(teacher.getTeacherFirstName()+" " + teacher.getTeacherLastName());
		}
	}
	
	public void update(Teacher teacher) {
		this.teacherDao.add(teacher);
		for (Logger logger : logger) {
			logger.Log(teacher.getTeacherFirstName() + " " + teacher.getTeacherLastName());
			
		}
	}
	
	
	
	

}
