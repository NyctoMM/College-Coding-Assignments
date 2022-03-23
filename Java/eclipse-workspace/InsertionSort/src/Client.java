
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] myArray = {5, 6, 8, 4, 99};
		
		insertionSort(myArray);
		
		printArray(myArray);
	}
	
	private static void insertionSort(int[] myArray) {
		/* in an insertion sort, the elements on the left are sorted within themselves
		 * but not necessarily with the entire array
		 * 
		 * go through every element in the array to find the new loewst value
		 * and index
		 */
		
		
		//outer loop
		for (int i = 0; i < myArray.length - 1; i++) {

			/*
			 * 1. take the first value, as well as the index, and set them to the be the lowest
			 */
			
			int lowestCurrentArrayIndex = 0;
			int lowestCurrentArrayValue = myArray[i];
			
			System.out.println("Outer loop first value: " + lowestCurrentArrayValue);
			
			
			//inner loop
			for(int j = 0; j < myArray.length; j++) {
				System.out.println("j is " + myArray[j]);
				
				if (myArray[j] < lowestCurrentArrayValue) {
					//get value and index for later:
					lowestCurrentArrayValue = myArray[j];
					lowestCurrentArrayIndex = j;

					System.out.println("new lowest value found: " + lowestCurrentArrayValue);
					System.out.println("new lowest value found at: " + lowestCurrentArrayIndex);
				}

			}
			
			if(lowestCurrentArrayValue < myArray[i]) {
				//Now, loop through the sorted portion
				//(left  handed side) and sort within that group)
				
			System.out.println("the lowest value is on the " + "left; no swap occuring");
				
			}
			else {
				System.out.println("the lowest value is in the " + "unsorted group");
				
				for(int k = lowestCurrentArrayIndex; k > i; k--) {
					
					myArray[k] = myArray[k - 1];
					
					}
			//Once the other items are moved around,
			//Insert hte new lowest:
				
			}
			
		}
	}
	public static void PrintArray(int[] myArray) {
		for(int i : myArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static void printArray(int[] myArray) {
		
	}

}
