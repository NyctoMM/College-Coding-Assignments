
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			Person a = new Person("Joe","Blow",37,"MI");
	        Person b = new Person("Kelly","Clarkson",32,"CA");
	        Person c = new Person("Matt","LeBlanc",53,"CA");
	        
	        HastTable myHashTable = new HastTable();
	        
	        myHashTable.add(a);
	        myHashTable.add(b);
	        myHashTable.add(c);
	        
			findByLastName("LeBlanc");
	}


}
