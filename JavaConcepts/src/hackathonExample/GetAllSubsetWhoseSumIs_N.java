//https://codereview.stackexchange.com/questions/36214/find-all-subsets-of-an-int-array-whose-sums-equal-a-given-target
package hackathonExample;

import java.util.Stack;

public class GetAllSubsetWhoseSumIs_N {
	/** Set a value for target sum */
	public static final int TARGET_SUM = 15;
	private Stack<Integer> stack = new Stack<Integer>();
	/** Store the sum of current elements stored in stack */
	private int sumInStack = 0;

	public void populateSubSet(int[] data, int fromIndex, int endIndex) {
		if (sumInStack == TARGET_SUM) {
			print(stack);
		}

		for (int currentIndex = fromIndex; currentIndex < endIndex; currentIndex++) {
			if (sumInStack + data[currentIndex] <= TARGET_SUM) {
				stack.push(data[currentIndex]);
				sumInStack += data[currentIndex];
				/*
				 * Make the currentIndex +1, and then use recursion to proceed
				 * further.
				 */
				populateSubSet(data, currentIndex + 1, endIndex);
				sumInStack -= (Integer) stack.pop();
				System.out.println("sumInStack::"+sumInStack);
			}
		}
	}

	private void print(Stack<Integer> stack) {
		StringBuilder sb = new StringBuilder();
		sb.append(TARGET_SUM).append(" = ");
		for (Integer i : stack) {
			sb.append(i).append("+");
		}
		System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
	}

	private static final int[] DATA = { 1, 3, 4, 5, 6, 2, 7, 8, 9, 10, 11, 13, 14, 15 };

	public static void main(String[] args) {

		GetAllSubsetWhoseSumIs_N get = new GetAllSubsetWhoseSumIs_N();
		get.populateSubSet(DATA, 0, DATA.length);

	}

}
