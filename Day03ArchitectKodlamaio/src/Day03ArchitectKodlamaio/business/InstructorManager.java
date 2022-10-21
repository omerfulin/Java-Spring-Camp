package Day03ArchitectKodlamaio.business;

import Day03ArchitectKodlamaio.core.logging.Logger;
import Day03ArchitectKodlamaio.dataAccess.Course.CourseDao;
import Day03ArchitectKodlamaio.dataAccess.Instructor.InstructorDao;
import Day03ArchitectKodlamaio.entities.Course;
import Day03ArchitectKodlamaio.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) throws Exception {
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + instructor.getLastName());
			
		}
	}
	
}
