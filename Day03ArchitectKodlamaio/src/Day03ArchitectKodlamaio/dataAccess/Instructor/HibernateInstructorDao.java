package Day03ArchitectKodlamaio.dataAccess.Instructor;

import Day03ArchitectKodlamaio.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate veritabanına eklendi. " + instructor);
		
	}

}
