package array_KeepingTrackofInsertedElements;

public class ArrrayClassWrapper {
	int[] myArray;
	boolean[] myArrayValuesSet;
	
    //	constructors
	// no default
	public ArrrayClassWrapper(int numberOfElements) {
		myArray = new int[numberOfElements];
		myArrayValuesSet = new boolean[numberOfElements];
		
	}
	
	public void set(int index, int value) {
		//Check to make sure index is valid
		if(index < myArray.length ) {
		
		}
	}
	
	public void removeByValue(int value) {
		for (int i = 0; i < myArray.length; i ++) {
			if(value == myArray[i]) {
				///Simply setting a false marker
				//onn a parallel array element;
				//we don't need to change the raw array value
				myArrayValuesSet[i] = false;
			}
		}
	}

	public void displayRawArray() {
		
	}
	public void displayLogicalArray() {
		//simply loop through and print all elements
		for (int i = 0; i < myArray.length; i++) {
			if(myArrayValuesSet[i] == true) {
				System.out.println("element at index " + i + " is " + myArray[i]);
			}
		}
	}
}
