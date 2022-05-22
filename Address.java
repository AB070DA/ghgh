
public class Address {
	
	//attributes
	private int flatNumber;
	private int houseNumber;
	private int postalCode;
	private String streetName;
	private String areaName;
	private String cityName;
	private String governorateName;
	private String country;
	
	// Constructor
	public Address() {
		flatNumber = 0;
		houseNumber = 0;
		postalCode = 0;
		streetName = null;
		areaName = null;
		cityName = null;
		governorateName = null;
		country = null;
	}
	
	public Address(int flateNumber, int houseNumber, int postalCode, String streetName, String areaName,
			String cityName, String governorateName, String country) {
		this.flatNumber = flateNumber;
		this.houseNumber = houseNumber;
		this.postalCode = postalCode;
		this.streetName = streetName;
		this.areaName = areaName;
		this.cityName = cityName;
		this.governorateName = governorateName;
		this.country = country;
	}
	
	// Methods
	public void setFlateNumber(int flateNumber) {
		this.flatNumber = flateNumber;
	}
	
	public int getFlateNumber() {
		return flatNumber;
	}
	
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	public int getHouseNumber() {
		return houseNumber;
	}
	
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	public int getPostalCode() {
		return postalCode;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public String getStreetName() {
		return streetName;
	}
	
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaName() {
		return areaName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getCityName() {
		return cityName;
	}

	public void setGovernorateName(String governorateName) {
		this.governorateName = governorateName;
	}

	public String getGovernorateName() {
		return governorateName;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
}
