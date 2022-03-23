
public class Client {
	public static void main(String[]  args) {
		LinkedList linkedList = new LinkedList(new Link());
		
		linkedList.printLinkedListState();
		
		//set the linkedList's beginning
		//first add:
		linkedList.add(new Link());
		linkedList.add(new Link());
		
		linkedList.deleteBeginning();
		
		//linkedList.printLinkedListState();
		linkedList.printLinkedList();
		
		linkedList.printLinkedListState();
	}
}
