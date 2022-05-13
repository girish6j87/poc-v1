package algo.arrays;

public class ArraySorted {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 5, 19 };
		System.out.println(isArraySorted(arr));
	}

	/*
	Time complexity is O(n2)
	Space complexity is O(1)
 	*/
	public static boolean isArraySorted(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					return Boolean.FALSE;
				}
			}
		}
		return Boolean.TRUE;
	}

	/*
	Time complexity is O(n)
	Space complexity is O(1)
	 */
	public static boolean isArraySortedWithOptimizedSol(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]){
				return Boolean.FALSE;
			}
		}
		return Boolean.TRUE;
	}
}
