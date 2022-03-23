public class LinkedListPerson {

    // data members
    Person beginning = null;
    Person currentLink = null; // currentLink only really matters
    // when we call a method
    // this will help us move through this
    Person end = null;
    
    
    // Constructor
    // Set both the beginning node and end node
    // to be the same object
    
    public LinkedListPerson() {
        
    }
    
    public LinkedListPerson(Person firstNode) {
        
        beginning = firstNode;
        end = firstNode;
        
        //System.out.println("calling LinkedLIstPerson()");
        
    }
    
    
    public void add(Person newLink) {
        
        // Handles if there is no beginning
        if(beginning == null && end == null) {
            beginning = newLink;
            end = newLink;
        }
        else {
            // We will this new link as the end element's next element
            end.next = newLink;
            
            // and then we will reset the end
            end = end.next;
            //end.next = null; // not necessary bc of constructor
            
            System.out.println("\n-calling end = end.next");
            System.out.println("  newLink: " + newLink);
            System.out.println("  end is now: " + end);
            
            System.out.println("end.next is now: " + end.next);
            
            //end.next = null;
        }
        
    }  // end add()
    
    
    public void deleteBeginning() {
        
        // Set the beginning element to be its next element
        beginning = beginning.next;
    }
    
    
    // Second version of delete
    public void delete(String firstName) {
        
        // Set the variables we need:
        currentLink = beginning;
        Person previousLink = currentLink; // or beginning works to bc of reference variables
        
        // loop through if we don't have a match
        while(currentLink.firstName != firstName) {
            
            // handle the end
            if(currentLink.next != null) {
                break;
            }
            // if we're not at the end
            else {
                // get something from previousLink
                previousLink = currentLink;
                currentLink = currentLink.next;
                
            }
            
            
        }  // end while
        
        
        // down here, we have (possibly) found the value
        // we will use the previousLink and currentLink that 
        // we have set inside of the loop
        
        // if the link is at the beginning
        if(currentLink == beginning) {
            beginning = beginning.next;
        }
        // if the link is at the end
        else if(currentLink == end) {
            
            System.out.println("currentLink at end: " + currentLink);
            System.out.println("end at end: " + end);
            
            end = previousLink;
            end.next = null;
        }
        // if the link is in the middle 
        else {
            // "Skip over" currentLink so that currentLink
            // no longer has any references to it:
            
            // Note: before, previousLink.next was equal to currentLink
            previousLink.next = currentLink.next;
        }
        
    }
    
    
    
    // print data members
    public void printLinkedListState() {
        
        System.out.println("beginning: " + beginning);
        System.out.println("beginning.next: " + beginning.next);
        System.out.println("end: " + end);
        System.out.println("end.next: " + end.next);
        
    }
    
    public void printLinkedList() {
        
        // Looping through until we find a node
        // that has its end at null
        
        // We will the "current" element to start the traversal
        // by setting it to the beginning element (which we don't
        // want to change) and then testing whether or not the
        // current element has a non-null next element
        currentLink = beginning;
        
        System.out.println();
        
        // Start the loop:
        while(currentLink.next != null) {
            
            System.out.println("\ncurrentLink: " + currentLink);
            System.out.print(" -currentLink.firstName: " + currentLink.firstName);
            System.out.print(" -currentLink.next: " + currentLink.next);
            
            // Get to the next link so we can print it
            // on the next pass:
            
            currentLink = currentLink.next;
            
        }
        
        System.out.println("\ncurrentLink: " + currentLink);
        System.out.print(" -currentLink.firstName: " + currentLink.firstName);
        System.out.print(" -currentLink.next: " + currentLink.next);
        
    } // end printLinkedList()
    
    
}



