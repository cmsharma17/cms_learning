import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Write a java program to check palindrome number.

Input: 329

Output: not palindrome number

Input: 12321

Output: palindrome number*/

public class PalindromeNumber {
	public static void main(String args[]){
		int sum=0,temp = 0,n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please Enter any Number to check Palindrome or not.");
			n = Integer.parseInt(br.readLine());//It is the number variable to be checked for palindrome  
			temp=n;
			while(n > 0){
				int r = n % 10; //getting remainder  
				sum = (sum*10)+r;
				n = n/10;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(temp == sum)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is Not Palindrome");
		
	}
}
