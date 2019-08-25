package hackathonExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindProduct {

	public static void main(String[] args) {
		int n;
		int product = 1;
		//int arrayRefVar[] ;
		int array[] = new int[50];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			//System.out.print("Length of Array n=");
			n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++){
				//System.out.println("Array Element::"+i);
				array[i] = Integer.parseInt(br.readLine());
			}
			for(int j =0;j<n;j++){
				//System.out.println(array[j]);
				product *=array[j];
				
			}
			System.out.println(product);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
