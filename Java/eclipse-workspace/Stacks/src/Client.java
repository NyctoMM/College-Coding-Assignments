
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			A();
	}
	
	public static void A() {
		B();
	}
	public static void B() {
		C();
	}
	public static void C() {
		
	}

}

/*
StackX:

int top = 0; //used to keep track ofo hte top of hte stack wiwll map to the array
int[] theStack = new int[10];

public void push(int number) {
	theStack[top] = number;
	top++
	}
public void peek() {
	if (top > 0) {
		System.out.println("item on top of stack: " + theStack[top - 1]);

ClientStackX
	
	StackX myStackk = new Stackx();
	
	myStack.push(23);
	myStack.peek();

*/