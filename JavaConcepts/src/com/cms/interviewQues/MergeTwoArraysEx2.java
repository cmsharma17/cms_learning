/*Merge two array lists to one without using inbuilt functions, map and set, remove all 
 * duplicates from merged list, and also print number of duplicates. */

package com.cms.interviewQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class MergeTwoArraysEx2 {
	public static void main(String args[]){
		String []s1 = {"a","e","i","b","b","c"};
		String []s2 = {"o","u","a","b","c"};
		
		List<String> list = new ArrayList<>(Arrays.asList(s1));
		list.addAll(Arrays.asList(s2));
		
		Object []o = list.toArray();
		
		System.out.println("Merged Arrays::"+Arrays.toString(o));
		
		/*Using Stream API to merge to arrays */
		Object[] both = Stream.concat(Arrays.stream(s1), Arrays.stream(s2)).toArray();
		String[] mergeArrays = Stream.concat(Arrays.stream(s1), Arrays.stream(s2)).toArray(String[]:: new);
		
		System.out.println("Merged Arrays::"+Arrays.toString(both));
		System.out.println("Merged String Arrays::"+Arrays.toString(mergeArrays));
		
		Map<String,String> map = new HashMap<>();
		Set<String> dupicateRecord = new HashSet<>();
		
		for(String s : mergeArrays){
			if(map.containsKey(s))
				dupicateRecord.add(s);
			else
				map.put(s, s);
		}
		
		System.out.println("Duplicate Records ::"+dupicateRecord);
	}
}
