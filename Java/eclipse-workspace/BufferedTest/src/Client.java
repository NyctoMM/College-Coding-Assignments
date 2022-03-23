import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		boolean userQuit = false;
		
		String userInput = null;
		
		//Don't test against null input; your program will crashh
		
		while(userInput != "Quit") {
			System.out.println("Top of loop quit value: " + userInput);
			System.out.println("Enter something or quit!");
			
			try {
				userInput = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("You entered " + userInput);
		}
	}

}
