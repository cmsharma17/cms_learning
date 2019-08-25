/*Swap a number using a 3rd varible */

public class NumberSwap {

	public static void main(String[] args) {
		int a=50;
		int b = 60;
		
		System.out.println("Befoew Swapping::"+"a="+a+",b="+b);
		
		NumberSwap obj = new NumberSwap();
		obj.swap(a,b);

	}
	
	public void swap(int aa, int bb){
		int temp;
		temp =aa;
		aa = bb;
		bb= temp;
		
		System.out.println("After Swapping::"+"a="+aa+",b="+bb);
		
	}

}
