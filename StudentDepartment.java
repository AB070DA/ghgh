package homeAddress;

public class StudentDepartment {

	// Attributes
	private String department;
	private int code;
	
	//Constructor
	public StudentDepartment() {
		department = null;
		code = 0;
	}

	public StudentDepartment(String department, int code) {
		this.department = department;
		this.code = code;
	}

	//Methods
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
}
