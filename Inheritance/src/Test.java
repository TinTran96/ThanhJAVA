
public class Test {

	public static void main(String[] args) {
		Truck truck = new Truck("Huyndai", 20, "Oil", 110);
		Car car = new Car("Audi", 1, "Electricity", 4);
		Motor motor = new Motor("Kawasaki", 2, "Gasoline", 40);
		truck.getMaxSpeed();
		car.getMaxSpeed();
		motor.getMaxSpeed();
		 
		System.out.printf("FuelEfficiency of car: %f " ,car.fuelEfficiency());
		System.out.printf("\nFuelEfficiency of truck: %f " ,truck.fuelEfficiency());
		System.out.printf("\nFuelEfficiency of motor: %f " ,motor.fuelEfficiency());
	}

}
