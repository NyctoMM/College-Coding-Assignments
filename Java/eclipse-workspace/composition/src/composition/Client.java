package composition;

public class Client {

	public static void main(String[] args) {
		// football Player
		FootballPlayer lawrenceTaylor = new FootballPlayer(56);
		//0FootballPlyer tomBrady = new FootballPLayer();
		
		
		System.out.println(lawrenceTaylor.getHelmet().getSize());
		
		lawrenceTaylor.getHelmet().setColor("blue");
		
		System.out.println(lawrenceTaylor.toString());
	}

}
