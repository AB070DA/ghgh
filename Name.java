
public class Name {
	
	//attributes
	private String firstName;	
	private String middleName;
	private String lastName;
	
	// arguments constructor  
	public Name(String first, String middle, String last) {
		firstName = first;
		middleName = middle;
		lastName = last;
	}
	
	//setter and getter methods
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
}
