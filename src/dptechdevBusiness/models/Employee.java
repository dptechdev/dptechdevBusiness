package dptechdevBusiness.models;

public class Employee {

	private String firstName;
	private String lastName;
	private long empId;
	private String telephoneNumber;
	private String managerLastName;
	private String departmentName;
	private long departmentId;
	
	public Employee() {}
	
	public Employee
	(String firstname, 
	String lastname,
	long empid, 
	String telephonenumber,
	String managerlastname,
	String departmentname,
	long departmentid)
	 
	{
		this.firstName = firstname;
		this.lastName = lastname;
		this.empId = empid;
		this.telephoneNumber = telephonenumber;
		this.managerLastName = managerlastname;
		this.departmentName = departmentname;
		this.departmentId = departmentid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getManagerLastName() {
		return managerLastName;
	}

	public void setManagerLastName(String managerLastName) {
		this.managerLastName = managerLastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
