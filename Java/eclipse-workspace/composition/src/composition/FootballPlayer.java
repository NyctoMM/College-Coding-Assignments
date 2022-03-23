package composition;

public class FootballPlayer {
	private int uniformNumber; //Privitve will have a value of 00 if
	//unassigned.
	private Helmet helmet; //arrays and objects will have a default value
	//of null if unassigned; these must be initatied by using
	// the keyword new somewhehre before they cna be used
	
	// Constructor(+)
		public FootballPlayer(int uniformNumber) {
			helmet = new Helmet(7.25, "blue");
		}
		public Helmet getHelmet() {
			return helmet;
		}
	
	//Get/Set Methods
	
	//Other Methods
}
