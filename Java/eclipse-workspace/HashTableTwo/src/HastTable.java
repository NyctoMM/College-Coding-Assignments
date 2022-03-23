import java.awt.FontFormatException;

public class HastTable {
    
    int numberOfBins = 128;
    // data members
    
    // A Linked List for each array position:
    LinkedListPerson[] hashTableLinkedList 
        = new LinkedListPerson[numberOfBins];
    
    
    public HastTable() {
        for (int i = 0; i < numberOfBins; i++) {
            hashTableLinkedList[i] 
                    = new LinkedListPerson(null);
        }
        
    }
    
    public void add(Person person) {
        
        // Determine the array position
        
        int indexToAddTo = Math.abs(person.hashCode() % numberOfBins);
        System.out.println("indexToAddTo: " + indexToAddTo);
        
        hashTableLinkedList[indexToAddTo].add(person);
        
    }
    
    
    public int stringToAscii(String value) {
        
        
        int sum = 0;  // used to "sum" a string based on its ASCII code points
        char[] charArray = value.toCharArray(); // used bc we can't directly
        // convert string to individual
        // characters in Java
        
        // for each character, convert it to its ASCII code point,
        // which is an underlying integer representation
        for (int i = 0; i < charArray.length; i++) {
            
            System.out.println("character is: " + charArray[i]);
            
            // now, take each character and convert
            // it to its character point,
            // then add to the sum:
            
            sum += charArray[i];
        }
        
        // Debug
        System.out.println("sum: " + sum);
        System.out.println("hash: " + sum % numberOfBins);
        
        
        // We want to return a value that
        // is within the index of the underlying hash table:
        return sum % numberOfBins;
        
    }
    
    public void printLinkedList() {
    	for (int i = 0; i < numberOfBins; i++) {
    		if (hashTableLinkedList[i].beginning != null) {
    			System.out.println("Object at bin " + i);
    			
    			System.out.println("" + hashTableLinkedList[i].beginning.firstName);   			
    	    	System.out.println("" + hashTableLinkedList[i].beginning.lastName   	);		
    	    	System.out.println("" + hashTableLinkedList[i].beginning.age    );			
    	    	System.out.println("" + hashTableLinkedList[i].beginning.state);
    		}
    	}
    } // end printLinkedList()
    
    public void findByLastName(String lastName) {
    	for (int i = 0; i < numberOfBins; i++) {
    		if (hashTableLinkedList[i].beginning.lastName == lastName) {
    			System.out.println("" + hashTableLinkedList[i].beginning);
    			System.out.println("" + hashTableLinkedList[i].beginning.firstName);   			
    	    	System.out.println("" + hashTableLinkedList[i].beginning.lastName   	);		
    	    	System.out.println("" + hashTableLinkedList[i].beginning.age    );			
    	    	System.out.println("" + hashTableLinkedList[i].beginning.state);
    		}
    	}
    }
    
}
