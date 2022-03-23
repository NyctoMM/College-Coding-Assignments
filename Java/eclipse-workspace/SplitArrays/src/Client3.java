
public class Client3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] myNumbers = {1,3,5,7,6,8,9};
		
		for(int i = 0; i < (myNumbers.length / 2) + 1; i++) {
			System.out.println("myNumbers[" + i + "]" + " is )"
					+  myNumbers[i]);
		}
		
		
		for(int i = myNumbers.length - 1; i > myNumbers.length / 2; i--) {
			System.out.println("myNumbers[" + i + "]" + " is " + myNumbers[i]);
		}
	}

}
