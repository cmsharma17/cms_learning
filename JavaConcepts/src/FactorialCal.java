import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialCal {
	public static void main(String args[]){
		int fact=1;
		System.out.println("Enter any Number:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			if(n > 0){
				for(int i=n;i>0;i--){
					fact = fact * i;
				}
				System.out.println("Factorial ="+fact);
			}
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
	}
}
