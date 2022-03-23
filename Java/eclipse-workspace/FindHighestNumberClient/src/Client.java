
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myNumber =  {3,5,9,7,6};
		
		int highestNumber = myNumber[0];
		int lowestNumber = myNumber[0];
		
		//No need to start at element 0 if we already have the value
		//of the first element
		
		for (int i = 1; i < myNumber.length; i++) {
			//If the current number is greater than the current high,
			if(myNumber[i] > highestNumber) {
				//set the new high to the current number
				highestNumber = myNumber[i];
			
			}
			
			for (int ii = 1; ii < myNumber.length; ii++) {
				if(myNumber[ii] < lowestNumber) {
					lowestNumber = myNumber[ii];
				}
			}	
			
			System.out.println("highestNumber: " + highestNumber);
			System.out.println("lowestNumber: " + lowestNumber);
		}
	}
}
