
public class ArrayClassWrapper1 {
	// The base/underlying array:
	private String[] myStringArray;
	private int insertAtIndex = 0;
	
	//Constructor 
	public ArrayClassWrapper1() {
	
			myStringArray = new String[10];
			
	}
	public ArrayClassWrapper1(int size) {
		if(size < myStringArray.length) {
			myStringArray = new String[size];
		}
		else {
			System.out.println("element is out of bounds");
		}
	}
	
	public void add(String itemToInsert) {
		myStringArray[insertAtIndex] = itemToInsert;
		insertAtIndex++;
	}
	
	public int getNumberOfElements() {
		return myStringArray.length;
	}
	
	//Get / Set individual Array item:
	public String get(int index) {
		// TODO Auto-generated method stub
		return myStringArray[index];
	}
	public void set(int index, String value ) {
	//	myStringArray
		//check to make sure if the index
		//is legitmate in the array
		if(index < myStringArray.length) { 
			myStringArray[index] = value;
		}
		
	}
	
	public void find(String value) {
		flag 
		
		for(int i = 0; i< myStringArray.length; i++) {
				//test the passed in value to every element in the array
				if(myStringArray[i] == value ) {
					System.out.println("Match! " + value 
							+ " is in the array.");
				}
		}
		System.out.println(value + " is not in the array.");
	}
}
