
public class Node {

	Node leftChild;
	Node rightChild;
	int value; //payload
	
	public Node(int value) {
		this.value = value;
	}

	public void addNode(int value) {
		//if the value passed in is sless than the parent,
		if(value < this.value) {
			leftChild = new Node(value);
		}
		else {
			rightChild = new Node(value);
		}
	}

}
