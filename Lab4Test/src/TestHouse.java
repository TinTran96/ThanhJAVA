
public class TestHouse {

	public static void prepareData(House[] houseList){
		houseList[0] = new House("A01", 2, 100.0, 100.0, false);
		houseList[1] = new House("A02", 4, 200.0, 200.0, true);
		for(int i = 0; i < 2; i++){
			System.out.printf("====o%do======", i+1);
			System.out.println("\nHouse code: " + houseList[i].getHouseCode());
			System.out.println("Bedrooms: "+ houseList[i].getNumOfBedRooms());
			System.out.println("Area: " + houseList[i].getArea());
			System.out.println("Cost per square meter: " + houseList[i].getCostPerSquareMeter());
			
		}
	}
	
	public static void sum(House[] houseList, double[] subTotal, double[] sellingPrice){
		int i = 0;
		for(i = 0; i < 2; i++){
			subTotal[i] = houseList[i].getArea() * houseList[i].getCostPerSquareMeter();
			if(houseList[i].getHasSwimmingPool() == true){
				subTotal[i] = subTotal[i] + 10.0/100.0 * subTotal[i];
			}
			sellingPrice[i] = subTotal[i] + 15.0/100.0 * subTotal[i];
			System.out.printf("\nPrice of House %d: %.2f", i+1, sellingPrice[i]);
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
