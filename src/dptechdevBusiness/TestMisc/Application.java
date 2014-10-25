package dptechdevBusiness.TestMisc;

import dptechdevBusiness.models.*;

public class Application {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setCustId(1);
		cust1.setFirstName("Derek");
		cust1.setLastName("Pauley");
		cust1.setPhoneNumber("931-802-1689");
		
		System.out.println(cust1.getFirstName());

	}

}
