/*If you overloaded a method with argument as List and another method argument as List<String>  
 * then it will work or not ?*/

package com.cms.interviewQues;

import java.util.ArrayList;
import java.util.List;

public class MethodOverloadingEx {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Chandra");
		al.add("mouli");
		
		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		
		MethodOverloadingEx obj = new MethodOverloadingEx();
		obj.getList(al);
		obj.getList1(al1);
	}

	public void getList1(List list) {
		System.out.println("getList1"+list);
	}

	public void getList(List<String> list) {
		System.out.println("getList"+list);
	}

}
