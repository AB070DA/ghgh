

public class Nationality {
	
	//Attributes
	private String nationality;
	
	// no arguments constructor
	public Nationality() {
		nationality = null;
	}

	//arguments constructor
	public Nationality(String nationality) {
		this.nationality = nationality;
	}
	
	//Methods 	
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public String getNationality() {
		return nationality;
	}
	
}
