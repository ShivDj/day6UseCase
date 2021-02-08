package AddressBook;

class Book {
	int id;
	String phoneNumber, fName, lName, city, zip, state, email;

	public Book(int id, String phoneNumber, String fName, String lName, String city, String zip, String state,
			String email) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.fName = fName;
		this.lName = lName;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.email = email;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	// @Override

	@Override
	public String toString() {
		return "Book [id=" + id + ", phoneNumber=" + phoneNumber + ", fName=" + fName + ", lName=" + lName + ", city="
				+ city + ", zip=" + zip + ", state=" + state + ", email=" + email + "]";
	}

}