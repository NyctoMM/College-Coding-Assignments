
public class Link {
	/*
	 * no Actual data here, except a reference to the next link
	 * 
	 * Note: we can refer to an object of a class within teh same class
	 * 
	 */
	
	Link next = null;
	
	//addingn a data member allows for a search/deletion:
	int value = 0;
	
	public Link(int value) {
		this.value = value;
		
	}
	public Link() {
		//dummy to avoid crashing all else!
	}
}
