package algo.arrays;

public class SecondLargestElmntFromArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 5, 8, 24, 3, 65, 20 };
		System.out.println("secondLargestElmnt : "+secondLargestElmnt(arr));
		System.out.println("secondLargestElmntWithOptimizedTimeComplexity : "+secondLargestElmntWithOptimizedTimeComplexity(arr));
	}

	/*
		Time complexity is O(n2)
		Space complexity is O(1)
	 */
	public static int secondLargestElmnt(int[] arr) {
		int firstLargestElmnt = getFirstLargestElmnt(arr);
		int secondLargestElmnt = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[firstLargestElmnt]) {
				if (secondLargestElmnt == -1) {
					secondLargestElmnt = i;
				} else if (arr[i] > arr[secondLargestElmnt]) {
					secondLargestElmnt = i;
				}
			}
		}
		return secondLargestElmnt;
	}

	public static int getFirstLargestElmnt(int[] arr) {
		int largest = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[largest]) {
				largest = i;
			}
		}
		return largest;
	}
	/*
			Time complexity is O(n)
			Space complexity is O(1)
		 */
	public static int secondLargestElmntWithOptimizedTimeComplexity(int[] arr) {
		int largest = 0;
		int result = -1;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[largest]){
				result = largest;
				largest = i;
			} else if (arr[i] != arr[largest] && (result == -1 || arr[i]>arr[result])) {
					result = i;
			}
		}
		return result;
	}
}
