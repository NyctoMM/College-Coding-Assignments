
public class Client_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {11, 7, 19, 18, 26, 22, 37, 12};
		
		SelectionSort(numbers);
		
	}
	
	private static void SelectionSort(int[] numbers) {
		
		for (int i = 0; i< numbers.length -1; i++) {
			int lowestNumber = numbers[0];
			int lowestNumberIndex = i;
			
			//figure out hte lowest number and its index
			//thene swap withthe first element
			for (int j = i + 1; j < numbers.length; j++) {
				
				//If we find a l ower number, dono't swap yet;
				//this will happen at the end of hte loop
				if(numbers[j] < lowestNumber) {
					lowestNumber = numbers[j]; //value
					lowestNumberIndex= j; // position / index
					
					System.out.println("-j is " + j + " and value is " + lowestNumber);
				}
			}
			
			System.out.println("lowestNumber: " + lowestNumber);
			
			//Now Swap:
			int temp = numbers[i];
			numbers[i] = lowestNumber;
			numbers[lowestNumberIndex] = temp;
		}
	}

}
