package kodlamaioDemo.entities;

public class Teacher {
	public String TeacherFirstName;
	public String TeacherLastName;
	
	public Teacher(String teacherFirstName, String teacherLastName) {
		TeacherFirstName = teacherFirstName;
		TeacherLastName = teacherLastName;
	}

	public String getTeacherFirstName() {
		return TeacherFirstName;
	}

	public void setTeacherFirstName(String teacherFirstName) {
		TeacherFirstName = teacherFirstName;
	}

	public String getTeacherLastName() {
		return TeacherLastName;
	}

	public void setTeacherLastName(String teacherLastName) {
		TeacherLastName = teacherLastName;
	}
	
	
	

}
