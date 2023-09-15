
public class Car extends Vehicle{

	int numSeats;
	public Car(String model, int year, String fuelType, int numSeats){
		super(model, year, fuelType);
		this.numSeats = numSeats;
	}
	
	public double fuelEfficiency(){
		return  (1.0 / (1.0 + (this.numSeats / 5.0)));
	}
	@Override
	public void getMaxSpeed(){
		System.out.println("The max speed of car is 120");
	}
	
}
