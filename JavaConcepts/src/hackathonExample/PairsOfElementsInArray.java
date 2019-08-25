/*Java Program To Find All Pairs Of Elements In An Array Whose Sum Is Equal To A Given Number */
package hackathonExample;

public class PairsOfElementsInArray {
	public static void main(String args[]){
		findThePairsOfElement(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
	}
	
	public static void findThePairsOfElement(int inputArray[], int inputNumber){
		System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
		for(int i =0 ;i< inputArray.length; i++){
			for(int j = i+1; j<inputArray.length; j++){
				if(inputArray[i]+inputArray[j] == inputNumber)
					System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
			}
		}
	}
}
