
public class Queue {
	int front = 0; // where to remove from
	int back = 0;
	int[] theQueue;
	int numberOfItems = 0; //helps determine whether or not we can add to the queue
	int MaxNumberOfItems = 10; //size of raw/underlying array
	
	public Queue(int maxNumberOfItems) {
		theQueue = new int[maxNumberOfItems];
	}
	//add to the back
	public void push (int value) {
		//add to the first available array location
		theQueue[back] = value;
		back++;
		
		//add to the number of items
		numberOfItems++;
	}
	
	public void pop() {
		//front the insertion location along:
		front++;
		//remove from the number of items:
		numberOfItems--;
	}
}
