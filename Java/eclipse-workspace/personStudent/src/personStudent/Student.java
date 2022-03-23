package personStudent;

public class Student extends Person {
	private String studentID;
	private double gpa;
	
	
	public Student(String firstName,
				String lastName,
				String ssn,
				String studentId,
				double gpa) {
		setFirstName(firstName);
		setLastName(lastName);
		setSSN(ssn);
		setStudentID(studentId);
		setGpa(gpa);
	}
	
	private void setGpa(double gpa2) {
		// TODO Auto-generated method stub
		
	}

	public Student() {
		//stub
	}
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	//Method we'll use to output student data,
	//which'll include data members from
	//the student class and the parent person class
	
	public String toString() {
		return "First Name: " + getFirstName()
			+ "\nLast Name: " + getLastName()
			+ "\nSSN: " + getSSN()
			+ "\nSSN Last Four: " + getSSNLast4D();
	}
}
