package hackathonExample;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PalindromeString ps = new PalindromeString();
		try {
			//System.out.println("Please write any word::");
			String sentence = br.readLine();
			ps.palindrome(sentence);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void palindrome(String sentence){
		String reverseString = "";
		for(int i = sentence.length()-1 ; i>=0 ; i--){
			//System.out.println(sentence.charAt(i));
			reverseString +=sentence.charAt(i);
		}
		if(sentence.equals(reverseString))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
