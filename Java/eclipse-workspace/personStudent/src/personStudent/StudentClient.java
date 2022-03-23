package personStudent;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student me = new Student();
		
		me.setStudentID("99");
		me.setFirstName("Chaz");
		me.setLastName("Wall");
		me.setSSN("413691337");
		me.setStudentID("1234");
	
		//Another way to instantiate
		//Preferred if possible:
		
		//Here I can
		me = new Student();
		
		System.out.println(me.toString()); //
		//if toString() isn't overridden (9give a
		//definiation in a sub class, in this case student)
		//the output will be a memeory address for hte JAVA
		//virtual machine
		
		System.out.println("me.getClass(): " + me.getClass());
		
		System.out.println("me.hashCode(): " + me.hashCode());
		
	}

}
