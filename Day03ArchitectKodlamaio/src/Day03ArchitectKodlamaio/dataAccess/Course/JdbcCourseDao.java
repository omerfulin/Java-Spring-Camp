package Day03ArchitectKodlamaio.dataAccess.Course;

import Day03ArchitectKodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao {
	
	public void add(Course course) {
		System.out.println("Ders Jdbc veritabanına eklendi. " + course);
	}

}
