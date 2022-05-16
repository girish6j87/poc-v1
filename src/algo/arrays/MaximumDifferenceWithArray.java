package algo.arrays;

public class MaximumDifferenceWithArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 10, 6, 78, 4, 1 };
		System.out.println("max diff is:" + maxDiff(arr, arr.length));
		System.out.println("max diff using optimized sol is:" + maxDiffWithOptimizedSolution(arr, arr.length));
	}

	//time O(n2) and space O(
	public static int maxDiff(int[] arr, int n) {
		int maxDiff = arr[1] - arr[0];
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				maxDiff = max(maxDiff, arr[j] - arr[i]);
			}
		}
		return maxDiff;
	}

	// Time O(n) and space O(1)
	public static int maxDiffWithOptimizedSolution(int[] arr, int n) {
		int maxDiff = arr[1] - arr[0];
		int minVal = arr[0];

		for(int i =1; i<n; i++){
			maxDiff = max(maxDiff,arr[i]-minVal);
			minVal = min(minVal,arr[i]);
		}
		return maxDiff;
	}


	private static int max(int maxDiff, int i) {
		return maxDiff > i ? maxDiff : i;
	}

	private static int min(int minVal, int i) {
		return minVal < i ? minVal : i;
	}
}
