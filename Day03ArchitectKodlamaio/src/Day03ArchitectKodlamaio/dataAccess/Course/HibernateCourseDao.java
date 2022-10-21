package Day03ArchitectKodlamaio.dataAccess.Course;

import Day03ArchitectKodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate veritabanına eklendi. " + course);
	}

}
