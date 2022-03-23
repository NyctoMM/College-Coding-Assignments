
public class LinkedList {
	Link beginning = null;
	Link currentLink = null; //currentLink only really matters
	//when we call a method thaat will help us move through this
	Link end = null;
	
	//Constructor //Set both the  beginning node and end node
	//to be the same objeect
	
	public LinkedList(Link firstNode) {
		beginning = firstNode;
		end = firstNode;
		
	}
	
	public void add(Link link) {
		//if we odn't have any items, set the beginning:
		if(beginning == null) {
			beginning = link;
			
			System.out.println("called add()"
					+ "for the first time;");
			System.out.println("beginning link lives"
			+ "at " + beginning);
		}
		else {
			end.next = link;
			System.out.println("/nAdding an element");
			System.out.println("-calling end.next = link-");
			System.out.println(" end.next is now: " + end.next);
			
			///then we reset end;
			end = end.next;
			System.out.println("n-calling end = end.next");
			System.out.println("end is now : " + end);
			
			System.out.println("end.next is now: " + end.next);
		}
		System.out.println("new link address: " + link);
	}
	
	public void deleteBeginning() {
		beginning = beginning.next;
	}
	
	public void delete(int value) {
		while(currentLink.value != value) {
			System.out.println(value);
			
			if(currentLink.value == value) {
				currentLink = currentLink.next;
			}
		currentLink = currentLink.next;
		}
		
	}
	
	
	//fPrint data members
	public void printLinkedListState() {
		System.out.println("beginning: " + beginning);
		System.out.println("end: " + end);
	}


	public void printLinkedList() {
		//Looping through until we find a node 
		//that has it's end at Null
		System.out.println("");
		
		//Looping through until we find a node that has its en at null
		/*
		 *We will set the current element to start the traversal by
		 * setting it to the begining element
		 *which we don't want to change
		 *and then testing whether or not the current
		 *element has a non-null next element 
		 */
		
		currentLink = beginning;
		
		while(currentLink.next !=null) {
			System.out.println("currentLink: " + currentLink);
			System.out.println("-currentLink.next: " + currentLink.next);
			
			//get to the next link so we can print it on the next pass
			currentLink = currentLink.next;
		}
	}
}
