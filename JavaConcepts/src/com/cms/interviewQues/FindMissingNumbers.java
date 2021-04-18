package com.cms.interviewQues;

import java.util.Arrays;
import java.util.BitSet;

/*How do you find the missing number in a given integer array of 1 to 100*/
public class FindMissingNumbers {
	public static void main(String args[]) {
		FindMissingNumbers obj = new FindMissingNumbers();
		obj.printMissingNumber(new int[] { 1, 2, 3, 4, 6 }, 6);
		obj.printMissingNumber(new int[] { 1, 2, 3, 5 }, 5);
		
		// two missing number printMissingNumber
		//obj.printMissingNumberNw(new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10}, 10);
		
		// three missing number printMissingNumber
		obj.printMissingNumberNw(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);

		}

	private void printMissingNumber(int arr[], int n) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}

		int missingNumber = (n * (n + 1)) / 2 - sum;
		System.out.println("Missing Number:->" + missingNumber);

	}

	private void printMissingNumberNw(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);
		for (int number : numbers) {
			System.out.println("number:"+number);
			bitSet.set(number - 1);
		}
		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", 
				Arrays.toString(numbers),count);
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}
}
