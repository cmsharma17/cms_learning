/*In TreeSet print order is not guranteed in printed in the sorted order*/

package com.cms.basicConcepts;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> map = new TreeSet<String>();
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("four");
		
		Iterator itr = map.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
