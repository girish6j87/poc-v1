package algo.arrays;

import java.util.Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		int[] arr = new int[] {12,3,14,23,9};
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	/*
	Time complexity is O(n)
	Space complexity is O(1)
	 */
	public static void reverseArray(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		while (left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}
