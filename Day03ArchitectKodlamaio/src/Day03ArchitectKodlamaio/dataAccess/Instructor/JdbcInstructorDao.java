package Day03ArchitectKodlamaio.dataAccess.Instructor;

import Day03ArchitectKodlamaio.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
	public void add(Instructor instructor) {
		System.out.println("Eğitmen JDBC veritabanına eklendi" + instructor);
	}

}
