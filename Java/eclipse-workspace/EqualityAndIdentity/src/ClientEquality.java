
public class ClientEquality {

	public static void main(String[] args) {

		Dog myDog = new Dog();
		Dog yourDog = new Dog();
		
		if(myDog == yourDog) {
			System.out.println("myDog == yourDog i s true");
		}
		else {
			System.out.println("myDog == yourDog is ffalse");
		}
	}

}
