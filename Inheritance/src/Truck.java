
public class Truck extends Vehicle{
	
	int cargoCapacity;
	public Truck(String model, int year, String fuelType, int cargoCapacity){
		super(model, year, fuelType);
		this.cargoCapacity = cargoCapacity;
	}
	
	public double fuelEfficiency(){
		return (1.0 / (1.0 + (this.cargoCapacity / 1000.0)));
	}
	@Override
	public void getMaxSpeed(){
		System.out.println("The max speed of truck is 80");
	}
	
}
