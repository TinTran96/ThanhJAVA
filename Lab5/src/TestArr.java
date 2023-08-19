import java.util.*;
public class TestArr {

	public static int sumMEMO(int[] a){
		int sum = 0;
		int even = 0;
		int odd = a[0];
		int i = 0;
		for(i = 0; i < a.length; i++){
			if(a[i] % 2 == 0 && a[i] > even){
				even = a[i];
			}
			if(a[i] % 2 != 0 && odd > a[i]){
				odd = a[i];
			}
		}
		sum = even + odd;
		return sum;
	}
	
	public static int idxLastOdd(int[] a){
		int odd = 0;
		for(int i = a.length - 1; i < a.length; i--){
			if(a[i] % 2 != 0){
				odd = a[i];
				break;
			}
		}
		return odd;
	}
	
	public static int[] input(int n){
		Scanner st = new Scanner(System.in);
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			System.out.printf("\nA[%d]", i+1);
			 arr[i] = st.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int i = 0;
		 do{
			 	System.out.print("Nhập vào số phần tử của mảng: ");
		        n = sc.nextInt();
		    }while (n < 0);
		 int[] a = new int[n];
		 for(i = 0; i < n; i++){
			 System.out.printf("A[%d]", i+1);
			 a[i] = sc.nextInt();
		 }
		 System.out.print("Sum of greatest even and smallest odd num: " + sumMEMO(a));
		 System.out.print("\nThe last odd number of the array: " + idxLastOdd(a));
		 int[] t = input(n);
		 for(i = 0; i < n; i++){
			 System.out.print("\nArray: " + t[i]);
		 }
		 sc.close();
	}

}
