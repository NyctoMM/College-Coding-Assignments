
public class ClientInsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayClassWrapper1 myArray =
					new ArrayClassWrapper1();
			//add element to array; the class
			//should take care of where it goes:
			myArray.add("eggs");
			myArray.add("butter");
			
			System.out.println("second element: " + myArray.get(1) );
			
			myArray.find("eggs");
	}

}
