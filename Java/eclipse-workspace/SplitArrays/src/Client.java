
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] myNumbersEven = {1,2,3,4,5,6,7,8,9,10};
		
		// SplitArrayIntoTwo(myNumbersEven);
		
		int[] myNumbersOddCount = {1,2,3,4,5,6,7,8,9};
		
		SplitArrayIntoTwo(myNumbersOddCount);
		
	}
	
	static void SplitArrayIntoTwo(int[] myArray) {
		
		for (int i = 0; i < myArray.length / 2; i++) {
		
			System.out.println("1. element" + i
					+ " is: " + myArray[i]);
		}
		//Second Half
		for (int i = (myArray.length / 2);
				+ i < myArray.length; i++) {
			
			System.out.println("2. element" + i
					+ " is: " + myArray[i]);
		}
	
	}
	

}
