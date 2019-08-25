/*Write a java program to check prime number.

Input: 44

Output: not prime number

Input: 7

Output: prime number*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPrime {
	public static void main(String args[]){
		int flag=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter Number:");
		try {
			int n= Integer.parseInt(br.readLine());	//it is the number to be checked 
			for(int i=2;i<n/2;i++){
				if(n%i==0){
					System.out.println("NUMBER IS NOT PRIME");
					flag=1;
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(flag == 0){
			System.out.println("NUMBER IS PRIME");
		}
	}
}
