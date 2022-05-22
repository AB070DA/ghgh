
public class Name {
	//attributes
	private String firstName;
	private String middleName;
	private String lastName;
	// constructor with arguments
	public Name(String first,String middle,String last) {
		firstName = first;
		middleName=middle;
		lastName= last;
	}
	//set first name
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	// set middle name
	public void setMiddleName(String middleName) {
		this.middleName=middleName;
	}
	// set last name
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	//get first name
	public String getFirstName() {
		return firstName;
	}
	// get middle name
	public String getMiddleName() {
		return middleName;
	}
	// get last name
	public String getLastName() {
		return lastName;
	}

}
