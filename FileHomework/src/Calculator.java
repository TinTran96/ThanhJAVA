import java.util.*;

public class Calculator {
	public static double divide(int a, int b) throws ArithmeticException{
		double division = 0;
		if(b == 0){
			throw new ArithmeticException("divide by 0");
		}else{
			division = a / b;
		}
		System.out.println("Divide: " + division);
		return division;
	}
	
	public static int multiply(int a, int b) throws NumberOutOfRangeException{
		int result = 0;
		if(a < -1000 || a > 1000){
			throw new NumberOutOfRangeException("Number is outside the computation");
		} else{
			result = a * b;
		}
		System.out.println("Multiply: " + result);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		do{
			System.out.printf("Enter number a: ");
			try{
				a = sc.nextInt();
				System.out.printf("\nEnter number b: ");
				b = sc.nextInt();
				multiply(a, b);
				divide(a, b);
			}catch(NumberOutOfRangeException e){
				System.out.println(e);
			}
			catch(ArithmeticException err){
				System.out.println(err);
			}
		}while(a < -1000 || a > 1000 || b == 0);
		sc.close();
	}

}
