import java.io.*;
import java.util.*;
public class Bai2Lab9 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("input.txt");
			Scanner myReader = new Scanner(fr);
			FileWriter fw = new FileWriter("output.txt");
			while(myReader.hasNextLine()) {
				String str = myReader.nextLine();
				fw.write(str.toUpperCase() + "\n");
			}
			fr.close();
			fw.close();
			myReader.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException err){
			err.printStackTrace();
		}
	}

}
