package hackathonExample;

public class FindProportions {

	public static void main(String[] args) {
		int arr[] = {-4, 3, -9, 0, 4, 1};
		plusMinus(arr);

	}

	static void plusMinus(int[] arr) {
		double n = arr.length;
		double posCount = 0;
		double negCount = 0;
		double zeroCount = 0;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
			if (arr[i] > 0) {
				System.out.println("posCount--"+posCount);
				posCount++;
			} else if (arr[i] < 0) {
				negCount++;
			} else if (arr[i] == 0) {
				zeroCount++;
			}
		}
		
		double d1 = 2.0/6.0;
		System.out.println("posCount-->"+d1);
        
        System.out.println(negCount/n);
        
        System.out.println(zeroCount/n);  

	}

}
