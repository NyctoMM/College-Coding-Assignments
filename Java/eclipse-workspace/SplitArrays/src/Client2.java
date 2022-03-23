
public class Client2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] myNumbers = {1,2,3,4,5,6};
		
		OutputAdjacentPairs(myNumbers);
	}
	
	static void OutputAdjacentPairs(int[] numbers) {
		int breakSet = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			
			if (numbers[i] < numbers[i + 1]) {
				System.out.print("first element of pair: " + numbers[i]);
				System.out.println("second element of pair: " + numbers[i + 1]);
			}
			else {
				breakSet = 1;
				break;
			}
		}
		if (breakSet == 1) {
			System.out.println("Out of Order.");
		}
	}

}
