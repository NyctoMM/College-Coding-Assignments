
public class QueueTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		ClientQueue myQueue =  new ClientQueue(10);
		
		for(int i = 0, x = myQueue.front; i < myQueue.numberOfItems; i++, x++) {
			if(x == myQueue.rawArray.length) {
				x = 0;
			}
			System.out.println(myQueue.rawArray[x]);
		}
	}
}
