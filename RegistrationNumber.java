

public class RegistrationNumber {
	
	// Attributes
	private String regNumber;
	private String year;
	private String term;
	private String faculty;
	private String department;
	private String studentNumber;
	
	//Constructor
	public RegistrationNumber() {
		regNumber = "0";
	}
	
	public RegistrationNumber(String year, String term, String faculty, String department, String studentNumber) {
		this.year = year;
		this.term = term;
		this.faculty = faculty;
		this.department = department;
		this.studentNumber = studentNumber;
		this.regNumber = this.year+this.term+this.faculty+this.department+this.studentNumber;
	}
	
	//Methods
	
	
}
