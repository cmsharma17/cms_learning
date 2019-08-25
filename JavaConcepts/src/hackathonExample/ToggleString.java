package hackathonExample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToggleString {
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ToggleString ts = new ToggleString();
		try {
			System.out.println("Please write any word::");
			String sentence = br.readLine();
			ts.toggleSentence(sentence);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void toggleSentence(String sentence){
		System.out.println("Before toggleing::"+sentence);
		StringBuilder toggled = new StringBuilder(sentence.length());
		for(char letter : sentence.toCharArray()){
			if(Character.isUpperCase(letter)){
				letter = Character.toLowerCase(letter);
			}else if(Character.isLowerCase(letter)){
				letter = Character.toUpperCase(letter);
			}
			toggled.append(letter);
		}	
		System.out.println("After toggleing::"+toggled);
	}
}
