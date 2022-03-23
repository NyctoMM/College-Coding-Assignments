package array_KeepingTrackofInsertedElements;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrrayClassWrapper myManagedArray
			= new ArrrayClassWrapper(10);
		
		myManagedArray.set(2,  99);
		myManagedArray.set(3, 100);
		myManagedArray.set(5, 102);
		
		myManagedArray.displayLogicalArray();
	}
		
	}

