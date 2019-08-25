/*Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 

How many different ways do you know to solve this problem?*/

package hackathonExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RotateArrayByKIndex {
	
	static int array[] ;
	static int lengthOfArray;
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		lengthOfArray = Integer.parseInt(br.readLine());
		array = new int[lengthOfArray];
		RotateArrayByKIndex obj = new RotateArrayByKIndex();
		obj.insertElement(lengthOfArray);
		obj.displayArray();
		System.out.print('\n'+"Kth Element from which need to rotate the Array:");
		int k = Integer.parseInt(br.readLine());
		System.out.println(k);
		rotateArray(array, k);
		System.out.println();
		System.out.println("After reversing::");
		obj.displayArray();
		
	}
	
	public void insertElement(int elements){
		int count = 5;
		for(int i=0;i<elements;i++){
			array[i]= count ++;
			System.out.println(array[i]);
		}
	}
	
	public void displayArray(){
		for(int i=0;i<lengthOfArray;i++){
			System.out.print(array[i]+" ");
		}
	}
	
	public static void rotateArray(int num[], int k){
		int result[] = new int[num.length];
		for(int i=0;i< k; i++){
			result[i] = num[num.length-k+i];
			System.out.print(result[i]);
		}
		
		int j=0;
	    for(int i=k; i<num.length; i++){
	        result[i] = num[j];
	        j++;
	        System.out.print("----"+result[i]);
	    }
	    
	    System.arraycopy( result, 0, num, 0, num.length );
	}
	
}
