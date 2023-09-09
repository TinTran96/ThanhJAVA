import java.io.*;
import java.util.*;
public class Bai4Lab9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File fl = new File("D:\\Eclipse\\FileHomework\\test\\4lab9.txt");
		if(fl.exists()){
			System.out.println("The file exists");
		}else{
			System.out.println("The file does not exist");
		}
		if(fl.isDirectory()){
			System.out.println("It is a directory");
		}else{
			System.out.println("It is not a directory");
		}
		if(fl.isFile()){
			System.out.println("This is a file");
		}else{
			System.out.println("This is not a file");
		}
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		try {
			FileWriter fw = new FileWriter(fl);
			fw.write(str);
			System.out.println("Done");
			fw.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
