
public class TestHouse {

	public static void prepareData(House[] houseList){
		houseList[0] = new House("A01", 2, 100.0, 100.0);
		houseList[1] = new House("A02", 4, 200.0, 200.0);
		houseList[1].hasSwimmingPool();
		int i = 0;
		for(i = 0; i < 2; i++){
			System.out.println(" " + houseList[i].getHouseCode());
			System.out.println(" " + houseList[i].getNumOfBedRooms());
			System.out.println(" " + houseList[i].getArea());
			System.out.println(" " + houseList[i].getCostPerSquareMeter());
		}
	}
	
	public static void sum(House[] houseList, double[] subTotal, double[] sellingPrice){
		int i = 0;
		for(i = 0; i < houseList.length; i++){
			subTotal[i] = houseList[i].getArea() * houseList[i].getCostPerSquareMeter();
			if(houseList[i].getHasSwimmingPool()){
				subTotal[i] = 10/100 * subTotal[i];
			}
		}
	}
	public static void main(String[] args){
		double[] subTotal = new double[2];
		double[] sellingPrice = new double[2];
		House[] houseList = new House[2];
		prepareData(houseList);
		sum(houseList, subTotal, sellingPrice);
	}

}
