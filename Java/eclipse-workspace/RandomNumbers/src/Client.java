import java.util.Random;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java.util.Random rando = new java.util.Random(); //without using an import
		
		Random rando = new Random();
		
		//Getting a random double:
		double randomDouble = rando.nextDouble();
		
		System.out.println("randomoDoubble: " + randomDouble);
		
		/*
		 * Each time we  call our Rrandom class object's
		 * nextDouble() or nextInt() method,
		 * itwill give us a new value:
		 */
		
		//Looping:
		for (int i = 0; i < 10; i++) {
			double randomDouble2 = rando.nextDouble();
			System.out.println("randomDouble: " + rando.nextDouble());
			
			int randomDoubleBetween1And10 = (int) (randomDouble2 * 10);

			System.out.println("randomdoubleBetween1And10: " + randomDoubleBetween1And10);
			
			System.out.println();
			
			
		}
		
	}

}
