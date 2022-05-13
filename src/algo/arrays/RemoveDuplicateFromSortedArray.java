package algo.arrays;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
	public static void main(String[] args) {
		int[] arr = new int[]{1,1,2,2,3,3,4,4,5,5};
		for(int i=0;i<removeDuplicates(arr); i++){
			System.out.print(arr[i]);
		}

	}

	public static int removeDuplicateFromSortedArray(int[] arr) {
		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		int res = 1;
		for (int i = 1 ; i < arr.length; i++){
			if(temp[res-1] != arr[i]){
				temp[res] = arr[i];
				res++;
			}
		}
		for (int i = 0; i<res; i++){
			arr[i] = temp[i];
		}
		return res;
	}

	//O(n) time and O(1) space
	public static int removeDuplicateFromSortedArrayWithOptimizedSol(int[] arr) {
		int res = 1;
		for(int i =1; i<arr.length; i++) {
			if(arr[i] != arr[res-1]){
				arr[res] = arr[i];
				res++;
			}
		}
		return res;
	}

	public static int removeDuplicates(int[] nums) {
		int ln = nums.length;
		int j = 0;
		for (int i = 1; i < ln; i++){
			if(nums[j] != nums[i]){
				nums[++j] = nums[i];
			}
		}
		return j+1;
	}
}
