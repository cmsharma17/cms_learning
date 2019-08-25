/*
Write a java program to sort an array elements using bubble sort algorithm.

Input: 18 9 33 4 84 32

Output: 4 9 18 32 33 84
*/
public class Bubblesort {

	public static void main(String[] args) {
		
		int arr[]={3,60,35,2,45,320,5,98};
		
		System.out.println("Array Before Bubble Sort");  
        
		for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        
		System.out.println();  
		bubbleSort(arr);
		
		System.out.println("Array After Bubble Sort");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

	}
	
	static void bubbleSort(int arr[]){
		int tmp=0;
		int n = arr.length;  
		for(int i=0;i<n;i++){
			for(int j=1;j<=n-1;j++){
				if(arr[j-1]>arr[j]){
					//swap elements  
					tmp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}

}
