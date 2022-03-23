
public class ClientTest {
	public static void main(String[]  args) {
		int[] numberSet1 = {5,7,13,20,25};
		int selection1 = 0;
		int[] numberSet2 = {8,9,10,21,28};
		int selection2 = 0;
		int[] finalNumbers = new int[10];
		
		//Until one of them finishes it just keeps going
		for(;selection1 < numberSet1.length && selection2 < numberSet2.length;) {
			
			if(numberSet1[selection1] < numberSet2[selection2]) {
				
				finalNumbers[selection1 + selection2] = numberSet1[selection1];
				selection1++;
				System.out.println("selection1 increased: " + selection1);
				
			}
			else if(numberSet2[selection2] < numberSet1[selection1]) {
				finalNumbers[selection2 + selection1] = numberSet2[selection2];
				selection2++;
				System.out.println("selection2 increased: " + selection2);
			}
		}

		if(selection1 < (numberSet1.length)) {
			for(int i = selection1; i < numberSet1.length; i++) {
				finalNumbers[selection1 + selection2] = numberSet1[selection1];
				System.out.println("selection1 increased: " + selection1);
			}
		}
		else if (selection2 < selection1) {
			for(int i = selection2; i < numberSet2.length; i++) {
				finalNumbers[selection2 + selection1] = numberSet2[selection2];
				System.out.println("selection2 increased: " + selection2);
			}
		}
		
		
		//Prints the final thing so I can see it
		for(int i = 0; i < finalNumbers.length; i++) {
			System.out.println(finalNumbers[i]);
		}
		
	}
}
