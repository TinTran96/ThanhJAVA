import java.util.*;

public class TestStr {

	public static int countWord(String paragraph){
		int dem = 0;
		StringTokenizer st = new StringTokenizer(paragraph);
		dem = st.countTokens();
		return dem;
	}
	
	public static int countSentence(String paragraph){
		int sen = 0;
		for(int i = 0; i < paragraph.length(); i++) {
			if (paragraph.charAt(i) == '.' || paragraph.charAt(i) == '?' || paragraph.charAt(i) == '!'){
				sen++;
			}
		}
		return sen;
	}
	
	public static int countAppear(String paragraph, String word){
		int app = 0;
		String sr[] = paragraph.split(" ");
		for(int i = 0; i < sr.length; i++){
			if(word.equals(sr[i])){
				app++;
			}
		}
		return app;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String paragraph = "The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some \r\n"
				+ "converts. It offers time trial, support for other input methods like touch and gamepads, \r\n"
				+ "accessibility improvements, high scores, and remastered visuals.";
		System.out.print("The number of words: "+ countWord(paragraph));
		System.out.print("\nThe number of sentence: " + countSentence(paragraph));
		System.out.printf("\nInput the word to count: ");
		String word = sc.nextLine();
		System.out.printf("\nThe word %s appear %d times", word, countAppear(paragraph, word));
		sc.close();
	}

}
