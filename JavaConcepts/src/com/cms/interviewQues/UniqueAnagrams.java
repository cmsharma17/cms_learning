/*Two strings are called anagrams if they contain same set of characters but in different order. For example, 
 * “Dormitory – Dirty Room”, “keep – peek”,  “School Master – The Classroom” are some anagrams. */

package com.cms.interviewQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueAnagrams {

	public static void main(String[] args) {
		String[] s = {"Dormitory","Dirty Room","keep", "peek","School Master","The Classroom"};
		
		List<String> list = new ArrayList<String>();
		
		for(String str : s){
			if(list.isEmpty())
				list.add(str);
			else {
				if(!checkForAnagram(str,list))
					list.add(str);
			}
		}
		System.out.println(list);
	}
	
	public static boolean checkForAnagram (String str, List<String> list){
		String copyOfstr = str.replaceAll("\\s", "");
		boolean status = false ;
		
		for(String s : list){
			String copyOfs = s.replaceAll("\\s", "");
			if(copyOfstr.length() != copyOfs.length())
	        {
				status = false;
	        }else{
	        	char[] s1Array = copyOfstr.toLowerCase().toCharArray();
	        	char[] s2Array = copyOfs.toLowerCase().toCharArray();
	        	//Sorting both s1Array and s2Array
	        	 
	            Arrays.sort(s1Array);
	 
	            Arrays.sort(s2Array);
	          //Checking whether s1Array and s2Array are equal
	            
	            status = Arrays.equals(s1Array, s2Array);
	        }
		}
		return status;
	}

}
