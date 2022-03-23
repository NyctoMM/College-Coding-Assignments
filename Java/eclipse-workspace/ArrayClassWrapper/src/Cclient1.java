
public class Cclient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayClassWrapper1 myArray =
				new ArrayClassWrapper1();
		ArrayClassWrapper1 myArray2 = new ArrayClassWrapper1(200);
		ArrayClassWrapper1 myArray3 = new ArrayClassWrapper1(500);
		//Can't do this since the underlying array is private

		System.out.println("first array element:  " + myArray.get(5));

		//set the 6th element;
		myArray.set(5, "Playing");
		myArray.set(2, "Cards");
		
		System.out.println("first array element:  " + myArray.get(5));
		
		myArray.set(99, "omega");
		
		System.out.println("number of items: "
				+ myArray2.getNumberOfElements());

	}
}
		