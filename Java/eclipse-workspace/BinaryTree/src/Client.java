
public class Client {
	public static void  main(String[] args) {
		Node rootNode = new Node(50);
		
		rootNode.addNode(17);
		
		//debug
		System.out.println("rootNode.leftChild.value: " + rootNode.leftChild.value);
	}
}
