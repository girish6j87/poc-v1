package algo.arrays;

import java.util.Arrays;

public class LeftRotateAnArrayByOne {
	public static void main(String[] args) {
		int[] arr = new int[]{12,1,3,5,6,7};
		leftRotateAnArrayByOne(arr);
		System.out.println(Arrays.toString(arr));
	}
	//Time O(n) and space O(1)
	public static void leftRotateAnArrayByOne (int[] arr){
		int temp = arr[0];
		for (int i =1; i< arr.length;i++) {
			arr[i-1]= arr[i];
		}
		arr[arr.length-1] = temp;
	}
}
