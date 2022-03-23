
public class ArrayListClassWrapper {
	//Start by adding items to the beginning;
	// create a marker variable that increases
	// and decreases upon eah addition or removal from
	// list
	
	int insertionPoint = 0;
	int[] listOfNumbers = new int[10];
	
	public void add(int value) {
		
		//Two step process:
		//1. set the value
		listOfNumbers[insertionPoint] = value;
		//2 move the internal marker
		insertionPoint++;
		
		System.out.println("after add(),"
				+ "insertionPoint is now " + insertionPoint);
	}
	
	public void remove() {
		//Simply move the insertion point backward;
		//the underlying contents of the array
		//don't change
		if(insertionPoint >= 1 ) {
			insertionPoint--;
		}
		System.out.println("After remove(),"
				+ "InsertionPoint is now" + insertionPoint);
	}
	
	public void display() {
		//only loop through whaht we've set using
		//add and remomve
		//(use the insertionPoint as the sentiel value
		//
		for(int i = 0; i < insertionPoint; i++) {
			System.out.println("[" + i + "] = "
					+ listOfNumbers[insertionPoint]);
		}
	}
}
