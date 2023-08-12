
public class TestRect {

	public static void main(String[] args) {
	Rectangle r1 = new Rectangle(5.0f, 3.0f);
	
    System.out.println("Length: " + r1.getLength());
    System.out.println("Width: " + r1.getWidth());

    System.out.printf("Area: %.2f%n", r1.getArea());
    System.out.printf("Perimeter: %.2f%n", r1.getPerimeter());
	}
}
