import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialCalWithRecursion {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			int fact=1;
			fact=factorial(n);
			System.out.println("Factorial of "+n+" is: "+fact);   
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    

}
