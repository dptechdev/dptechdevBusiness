package dptechdevBusiness.models;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private long custId;
	
	public Customer() {}
	
	public Customer
	(String firstname, 
	String lastname, 
	String phonenumber,
	long custID)
	
	{
		this.setFirstName(firstname);
		this.setLastName(lastname);
		this.setPhoneNumber(phonenumber);
		this.setCustId(custID);
	}
	

	public String getFirstName() {
		return firstName;
	}
	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

}
