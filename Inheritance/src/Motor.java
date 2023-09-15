
public class Motor extends Vehicle{

	int engineDisplacement;
	public Motor(String model, int year, String fuelType, int engineDisplacement){
		super(model, year, fuelType);
		this.engineDisplacement = engineDisplacement;
	}
	
	public double fuelEfficiency(){
		return (1.0 / (1.0 + (this.engineDisplacement / 1000.0)));
	}
	@Override
	public void getMaxSpeed(){
		System.out.println("The max speed of motor is 80");
	}
	
}
