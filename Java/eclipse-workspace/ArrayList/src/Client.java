import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This generici Arraylist can take objects of 
		//all data types
		ArrayList myArrayList = new ArrayList();
		
		
		//Adding elements ofo various data types:
		myArrayList.add("hello");
		myArrayList.add(5); // Adding an integer
		//myArrayList.add(new ComputerSystsem());
		
		//Get an element:
		System.out.println(myArrayList.get(1));
		
		//This ArrayList only takes strings:
		ArrayList<String> MyArrayListOfStrings = new ArrayList<String>();
		
		//Don't do this // myArrayListOfStrings.add(5);
		
		//NOTE::
		MyArrayListOfStrings.set(5, "aalkjdsfs");
		
		//contains()
		//we canonly compare against an actual object/variable
		/*
		 * if{myArrayList.contains("Broncos")) {
		 * 	print
		 * 
		 * else
		 * false
		 */
		
		//standable object not in array
		Object a = new Object();
		Object b = new Object();
		myArrayList.add(a);
		myArrayList.add(b);
		
		if(myArrayList.contains(a) ) {
			System.out.println("a is in the array list");
		}
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		boolean set = False;
		
		if(myArrayList.contains(o1) ) {
			set = True;
		}
		else {
			set = False;
			
		}
		
		//removal of items
		//we can remove items by index or actual object
		myArrayList.remove(b);
		myArrayList.remove(1);
		
		}
	}

