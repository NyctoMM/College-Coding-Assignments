
public class ClientQueue {	    
	    int front = 0; // where to remove from
	    int back = 0;  // where to add to
	    int[] rawArray;
	    int numberOfItems = 0; // helps determine whether or not we 
	        // can add to the Queue
	    int maxNumberOfItems = 10; // size of raw/underlying array
	    
	    
	    public ClientQueue(int maxNumberOfItems) {
	        
	        rawArray = new int[maxNumberOfItems];
	        
	    }
	    
	    // looking at the most recently added item:
	    public void peek() {
	        
	        if(back > 0) {
	            System.out.println(rawArray[back - 1]);
	        }
	        else {
	            System.out.println(rawArray[rawArray.length - 1]);
	        }
	    }
	    
	    // Adding to the 'back'
	    public void push(int value) {
	        
	        if(numberOfItems < rawArray.length) {
	            // add to the first available array location:
	            rawArray[back] = value;
	            back++;
	            
	            // add to the number of items:
	            numberOfItems++;
	            
	            // if 
	            if(back == rawArray.length) {
	                back = 0;
	            }
	            
	        }
	        else {
	            System.out.println("Queue is full; not adding");
	        }
	    }
	    
	    
	    // Removing from the 'front'
	    public void pop() {
	        
	        // if we have items, remove:
	        if(numberOfItems > 0) {
	            // front the insertion location along:
	            front++;
	            // remove from the number of items:
	            numberOfItems--;
	        }
	        else {
	            System.out.println("Queue is empty; not removing");

	        }
	        
	    }
	    
	    public void printState() {
	        
	        System.out.println("---");
	        System.out.println("front: " + front);
	        System.out.println("back: " + back);
	        System.out.println("numberOfItems: " + numberOfItems);
	        // System.out.println("maxNumberOfItems: " + maxNumberOfItems);
	        System.out.println("---");
	        
	    }
	    
	    public void printRawArray() {
	        for(int value : rawArray) {
	            System.out.println("value:" + value);
	        }
	    }
	    

	}


