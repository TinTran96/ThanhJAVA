import java.util.*;
public class Arr {

	public static int  isEqualArrs(int[] y, int[] a){
		int result;
		if(Arrays.equals(y, a)){
			result = 1;
		}else {
			result = 0;
		}
		return result;
	}
	
	public static void removeDuplicate(int[] a, int n){
		if(n == 0 || n == 1){
			System.out.println("No duplicate");
		}
		int i = 0;
		int j = 0;
		int[] x = new int[n]; 			//tạo biến lưu trữ
		for(i = 0; i < n - 1; i++){
			if(a[i] != a[i+1]){			//bỏ đi duplicate
				x[j++] = a[i];			//x[1] = vị trí không có duplicate, rồi lặp lại
			}
		}
		x[j++] = a[n-1];				//giá trị ở vị trí cuối ở x = gt vị trí áp cuối của a
		for (i = 0; i < j; i++){  
            a[i] = x[i];  				//gán gíá trị 
            System.out.print(" " + a[i]);
        }
    }  
	
	public static void averageMinMax(){
		double sum = 0.0;
		int[] o = {4, 3, 6, 2, 8, 10};
		Arrays.sort(o);
		int length = o.length - 2;
		for(int i = 1; i < o.length-1; i++){
			sum += o[i];
		}
		double average = sum/length;
		System.out.print("\nTrung bình tổng là: " + average);
	}
	
	public static void sumArr(){
		int[] arr = {1, 2, 3, 4, 5, 6, 9};
		int x = 7;
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] + arr[j] == x){
					System.out.printf("\nHai index có tổng bằng %d ở vị trí %d và %d", x, i, j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		 do{
			 	System.out.print("Nhập vào số phần tử của mảng: ");
		        n = sc.nextInt();
		    }while (n < 0);
		 int[] a = new int[n];
		 int i = 0;
		 for(i = 0; i < n; i++){
			 System.out.printf("A[%d]", i+1);
			 a[i] = sc.nextInt();
		 }
		 Arrays.sort(a);
		 int[] y = {1, 2, 2, 3, 4};
		 int x = isEqualArrs(a, y);
		 if(x == 1){
			 System.out.print("\nHai mảng bằng nhau");
		 }else{
			 System.out.print("\nHai mảng không bằng nhau");
		 }
		 removeDuplicate(a, n);
		 averageMinMax();
		 sumArr();
		 sc.close();
	}

}