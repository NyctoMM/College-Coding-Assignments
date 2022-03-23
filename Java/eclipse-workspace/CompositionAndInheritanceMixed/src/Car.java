
public class Car extends Vehicle {
	Engine engine;
	double displacement;
	
	public Car( double displacement) {
		super();
		engine = new Engine();
		this.displacement = displacement;
	}
}
