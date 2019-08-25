/*Check whether a given string is a panagram or not.*/
package hackathonExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PangramExample {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write any sentence::");
		String sentence = br.readLine();
		boolean status = checkPanagram(sentence);
		System.out.println("Given String Panagram status is ::"+status);
		
	}
	
	public static boolean checkPanagram(String s){
		if(s.length() < 26)
			return false;
		else{
			for(char ch= 'a'; ch<='z' ; ch++){
				System.out.println("s.indexOf(ch)::"+s.indexOf(ch));
				if(s.indexOf(ch)<0){
					return false;
				}
			}
		}
		return true;
	}
}
