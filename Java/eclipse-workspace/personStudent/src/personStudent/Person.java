package personStudent;

public class Person {
	private String firstName;
	private String lastName;
	private String ssn;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSSN() {
		return ssn
				+
				"\nSSN: "
				+ ssn.substring(0,3)
				+ "-"
				+ ssn.substring(3,5)
				+ "-"
				+ ssn.substring(5,9);
	}
	public String getSSNLast4D() {
		
		if(ssn != null ) {
			return ssn.substring(5);
		}
		else {
			return null;
		}
	}
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
}
