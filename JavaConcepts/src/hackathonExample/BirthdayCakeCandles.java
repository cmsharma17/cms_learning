package hackathonExample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class BirthdayCakeCandles {

	public static void main(String args[]) {
		int arr[] = { 13,12,11,14,13,13,14 };
		findMaxCandles(arr);
	}

	public static void findMaxCandles(int arr[]) {
		Map<Integer, Integer> mapCandlesWithCount = new HashMap<>();

		for (int i=0; i< arr.length; i++) {

			if (mapCandlesWithCount.containsKey(arr[i])) {
				mapCandlesWithCount.put(arr[i], mapCandlesWithCount.get(arr[i]) + 1);
			} else {
				mapCandlesWithCount.put(arr[i], 1);
			}
		}

		int i = Collections.max(mapCandlesWithCount.entrySet(),
				(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) -> e1.getValue().compareTo(e2.getValue())).getKey();

		System.out.println(mapCandlesWithCount.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
		
		System.out.println(i);

	}
}
