import java.io.*;
import java.util.*;

public class Bai5Lab9 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("inputNumber.txt");
			Scanner sc = new Scanner(fr);
			FileWriter fw = new FileWriter("outputNumber.txt");
			int sum = 0;
			while(sc.hasNextInt()){
				sum += sc.nextInt();
			}
			System.out.print(sum);
			fw.write(String.valueOf(sum));
			fr.close();
			fw.close();
			sc.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException err){
			err.printStackTrace();
		}
	}

}
