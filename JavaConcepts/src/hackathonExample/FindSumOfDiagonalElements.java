package hackathonExample;

import java.util.ArrayList;
import java.util.List;

public class FindSumOfDiagonalElements {

	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();

		List<Integer> o1 = new ArrayList<Integer>() {
			{
				add(11);
				add(2);
				add(4);
			}
		};
		
		List<Integer> o2 = new ArrayList<Integer>() {
			{
				add(4);
				add(5);
				add(6);
			}
		};
		
		List<Integer> o3 = new ArrayList<Integer>() {
			{
				add(10);
				add(8);
				add(-12);
			}
		};
		 
		arr.add(o1); arr.add(o2); arr.add(o3);
		
		diagonalDifference(arr);
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		int matrixSize = arr.size();
		int d1 = 0;
		int d2 = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				if (i == j) {
					
					d1 += arr.get(i).get(i);
				}
				
				if(i == (matrixSize - j - 1)){
					System.out.println("--"+arr.get(i).get(j));
                    d2 += arr.get(i).get(i);    
                }
			}
		}
		
		return Math.abs(d1-d2);

	}

}
