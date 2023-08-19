
public class RegularPolygon {
	private String name;
	private int edgeAmount;
	private double edgeLength;
	
	public RegularPolygon(){
		this.name = "";
		this.edgeAmount = 3;
		this.edgeLength = 1;
	}
	
	public RegularPolygon(String name, int edgeAmount, double edgeLength){
		this.name = name;
		this.edgeAmount = edgeAmount;
		this.edgeLength = edgeLength;
	}
	public RegularPolygon(String name, int edgeAmount){
		this.name = name;
		this.edgeAmount = edgeAmount;
		this.edgeLength = 1;
	}
	public RegularPolygon(RegularPolygon polygon){
		
	}
	
	public String getName(){
		return name;
	}
	public int getEdgeAmount(){
		return edgeAmount;
	}
	public double getEdgeLength(){
		return edgeLength;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setEdgeAmount(int edgeAmount){
		this.edgeAmount = edgeAmount;
	}
	public void setEdgeLength(double edgeLength){
		this.edgeLength = edgeLength;
	}
	public String getPolygon(){
		if(edgeAmount == 3){
			name = "Triangle";
		}
		if(edgeAmount == 4){
			name = "Quandrangle";
		}
		if(edgeAmount == 5){
			name = "Pentagon";
		}
		if(edgeAmount == 6){
			name = "Hexagon";
		}
		if(edgeAmount > 6){
			System.out.print("\nPolygon has the number of edges greater than 6");
		}
		return name;
	}
	
	public double getPerimeter(){
		return edgeLength * edgeAmount;
	}
	public double getArea(){
		double a = 0;
		if(edgeAmount == 3){
			a = 0.433;
		}
		if(edgeAmount == 4){
			a = 1;
		}
		if(edgeAmount == 5){
			a = 1.72;
		}
		if(edgeAmount == 6){
			a = 2.595;
		}
		double area = edgeLength*edgeLength*a;
		if(edgeAmount > 6){
			area = -1;
		}
		return area;
	}
	public String toString(){
		return name + " " + getPolygon() + " " + getArea(); 
	}
	
	
}
