
public class Dog {
	String name;
		int age;
		
		public Dog(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		public Dog() {
			System.out.println("this: " + this);
			System.out.println("this.name: " + this.name);
			System.out.println("this.age: " + this.age);
		}
}
