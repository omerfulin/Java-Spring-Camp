package kodlamaioDemo.entities;

public class Course {
	public String courseName;
	public int unitPrice;
	
	public Course(String courseName, int unitPrice) {
		this.courseName = courseName;
		this.unitPrice = unitPrice;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	

}
