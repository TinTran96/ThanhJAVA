
public class House {
	private String houseCode;
	private Integer numOfBedRooms;
	private double area;
	private double costPerSquareMeter;
	private Boolean hasSwimmingPool;
	
	public House(){
		houseCode = "A01";
		numOfBedRooms = 2;
		area = 0;
		costPerSquareMeter = 0;
		hasSwimmingPool = false;
	}
	public House(String houseCode, int numOfBedRooms, double area, double costPerSquareMeter, boolean hasSwimmingPool){
		this.houseCode = houseCode;
		this.numOfBedRooms = numOfBedRooms;
		this.area = area;
		this.costPerSquareMeter = costPerSquareMeter;
		this.hasSwimmingPool = hasSwimmingPool;
	}
	
	public String getHouseCode(){
		return houseCode;
	}
	public void setHouseCode(String houseCode){
		this.houseCode = houseCode;
	}
	public int getNumOfBedRooms(){
		return numOfBedRooms;
	}
	public void setNumOfBedRooms(int numOfBedRooms){
		this.numOfBedRooms = numOfBedRooms;
	}
	public boolean getHasSwimmingPool(){
		return hasSwimmingPool;
	}
	public void setHasSwimmingPool(boolean hasSwimmingPool){
		this.hasSwimmingPool = hasSwimmingPool;
	}
	public double getArea(){
		return area;
	}
	public void setArea(double area){
		this.area = area;
	}
	public double getCostPerSquareMeter(){
		return costPerSquareMeter;
	}
	public void setCostPerSquareMeter(double costPerSquareMeter){
		this.costPerSquareMeter = costPerSquareMeter;
	}
}