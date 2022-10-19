package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Teacher;

public interface TeacherDao {
	
	void add(Teacher teacher);
	
	void update(Teacher teacher);
	
	void delete(Teacher teacher);

}
