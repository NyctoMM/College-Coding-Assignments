
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car(3);
		myCar.setYearManufactured(1999);
		myCar.setModel("WRX");
		
		//Legal even though the parent class "Vehicle" is abstract;
		//this is because the actual object is a CAR
		Vehicle myVehicle = new Car(3.0);
		

	}

}
