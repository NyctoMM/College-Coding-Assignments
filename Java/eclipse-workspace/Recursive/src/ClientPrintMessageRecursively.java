
public class ClientPrintMessageRecursively {
	public static void main(String[] args) {
		
		printStuff(5);
	}
	public static void printStuff(int numberOfTimes) {
		if(numberOfTimes > 0) {
			System.out.println("numberOfTimes is: " + numberOfTimes);
			
			printStuff(numberOfTimes-1);
		}
		else {
			System.out.println("base case / end Reached");
		}
	}

}
