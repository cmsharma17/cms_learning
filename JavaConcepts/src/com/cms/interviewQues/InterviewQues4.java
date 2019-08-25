/*An array that contain even and odd number, write a program to sort even number in ascending 
order and odd number
 * in descending order  */

package com.cms.interviewQues;


public class InterviewQues4 {
	 static int a[] = { 30, 56, 95, 21, 32, 98, 3, 73, 84 };
	 int length = a.length;
	 int eArray[] = new int[length];
	 int oArray[] = new int[length];
	 int[] reversed = new int[length];

	int n = 0;
	int k = 0;

	public static void main(String[] args) {
		InterviewQues4 obj = new InterviewQues4();
		obj.sortArray(a);
	}

	public void sortArray(int[] array) {
		for (int number : array) {
			if (number % 2 == 0) {
				eArray[n] = number;
				n++;
			} else {
				oArray[k] = number;
				k++;
			}
		}
		insertionSort(eArray);
		insertionSort(oArray);
		reverseArray(oArray);
		mergeArray(eArray,oArray);
	}

	public void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
        printNumbers(array);
    }

	private void printNumbers(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}
	
	private void reverseArray(int[] array){
		
	    for (int i=0; i<array.length; i++) {
	    	reversed[i] = array[array.length - 1 - i];
	    }
	    printNumbers(reversed);
	}
	
	private void mergeArray(int eArray[], int[] oArray){
		int count = 0;
		for(int i=0; i<eArray.length; i++){
			if(eArray[i] != 0){
				a[count] = eArray[i];
				count ++;
			}
		}
		
		for(int i=0; i<oArray.length; i++){
			if(oArray[i] != 0){
				a[count] = oArray[i];
				count ++;
			}
		}
		printNumbers(a);
	}

	/* Sort Array by using default function of List 
	public void sortArrayByUsingList() {
		List<Integer> al = new ArrayList<Integer>(Arrays.asList(a));
		List<Integer> evenArray = new ArrayList<Integer>();
		List<Integer> oddArray = new ArrayList<Integer>();

		List<Integer> finalList = new ArrayList<Integer>();
		Collections.sort(al);
		for (Integer number : al) {
			if (number % 2 == 0) {
				evenArray.add(number);
			} else
				oddArray.add(number);
		}

		Collections.sort(evenArray);
		Collections.sort(oddArray);
		Collections.reverse(oddArray);

		for (int number : evenArray)
			finalList.add(number);
		for (int number : oddArray)
			finalList.add(number);

		System.out.println(finalList);
	}*/
}
