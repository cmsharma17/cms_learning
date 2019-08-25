/*
        Swap Numbers Without Using Third Variable Java Example
        This Swap Numbers Java Example shows how to
        swap value of two numbers without using third variable using java.
*/
public class NumberSwapWithoutThirdVariable {

	public static void main(String[] args) {
		int a = 40;
		int b= 60;
		
		System.out.println("Before Swapping::"+"a="+a+",b="+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping::"+"a="+a+",b="+b);

	}

}
