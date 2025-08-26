package intro;

public class Address {
	private int doorNo;
	private String street;
	private String locality;
	private int pincode;
	private String city;
	private String state;
	private String country;
	public Address(int doorNo, String street, String locality, int pincode, String city, String state, String country) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.locality = locality;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	} 
	public String toString() {
		return  getDoorNo()+" "+getStreet()+" "+getLocality()+" "+getPincode()+" "+getCity()+" "+getState()+" "+getCountry();
	}
}
