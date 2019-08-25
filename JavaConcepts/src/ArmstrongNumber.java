/*An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to
 *the number itself. For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
 
Write a java program to check Armstrong number.
Input: 153
Output: Armstrong number
Input: 22
Output: not Armstrong number*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int temp,a,c=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			temp = n;
			while(n>0){
				a=n%10;
				n=n/10;
				c=c+(a*a*a);
			}
			if(temp==c)
				System.out.println("Number Is Armstrong");
			else
				System.out.println("Number Is Not Armstrong");
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
