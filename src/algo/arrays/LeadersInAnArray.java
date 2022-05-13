package algo.arrays;

public class LeadersInAnArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 7, 10, 12, 10, 6, 5, 2 };
		leaders(arr, arr.length);
		//leadersWithOptimizedSol(arr,arr.length);
	}

	//Time O(n2) and space O(1)
	public static void leaders(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			boolean leader = false;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] <= arr[j]) {
					leader = true;
					break;
				}
			}
			if (!leader) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	//Time O(n) and space O(1)
	public static void leadersWithOptimizedSol(int[] arr, int n) {
		int current_leader = arr[n - 1];
		System.out.print(current_leader + " ");
		for (int i = n - 2; i >= 0; i--) {
			if(current_leader < arr[i]){
				current_leader = arr[i];
				System.out.print(current_leader + " ");
			}
		}
	}

}
