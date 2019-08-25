package com.cms.interviewQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondMinimum {

	public static void main(String[] args) {
		Integer[] inputArray = { 2, 19, 1, 89, 97, 4, 6, 8, 19, 24, 45 };
		Arrays.asList(inputArray);
		// Convert input array to List
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(inputArray));

		// Convert list to sorted set using treeSet
		Set<Integer> set = new TreeSet<Integer>(list);

		System.out.println(Arrays.toString(list.toArray()));
		System.out.println(set);

		System.out.println("Second minimum number is ::" + set.toArray()[1]);

	}

}
