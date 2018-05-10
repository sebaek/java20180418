package chapter08;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
	
		bus.checkFare();
		
		Vehicle vehicle = bus;
		
//		vehicle.checkFare();
		
		if (vehicle instanceof Bus) {
			Bus bus2 = (Bus) vehicle;
			bus2.checkFare();
		}
		
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
