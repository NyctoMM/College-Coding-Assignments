
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Multiplication Tables
		
		//Outer Loop
		/*for(int i = 0; i <= 12; i++) {
			
			System.out.println("Outer loop - i is " + i);
			
			//Inner Loop
			for(int ii = 0; ii <=12; ii++) {
				
				System.out.println(" Inner Loop - ii is " + ii);
				
				int iii = i * ii;
				
				System.out.println("  Multiplication of i & ii is " + iii);
			}
		}*/
		
		for(int i = 0; i <= 9; i++) {
			System.out.println("");
			
				for(int ii = 1; ii <= 9; ii++) {
					System.out.print(i + "" + ii + " ");
				}
				System.out.print(i+1+"0");
			
		}
	}

}
