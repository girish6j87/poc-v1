package algo.arrays;

import java.util.Arrays;

public class LeftRotateAnArrayByD {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};
		int d = 2;
		int length = arr.length;
//		leftRotateByD(arr,length,d);
//		leftRotate(arr,length,d);
		leftRotateWithOptimizedWay(arr,length,d);
		System.out.println(Arrays.toString(arr));
	}
	// Time O(2n) space O(1)
	public static void leftRotateByD(int[] arr, int length, int d){
		for (int i = 0; i<d; i++){
			LeftRotateAnArrayByOne.leftRotateAnArrayByOne(arr);
		}
	}

	// Time O(n+d) and O(n)
	public static void leftRotate(int[] arr, int length, int d) {
		int[] temp = new int[arr.length];
		for (int i =0; i<d; i++) {
			temp[i] = arr[i];
		}
		for(int i = d; i<length; i++) {
			arr[i-d] = arr[i];
		}
		for (int i=0; i<d; i++){
			arr[length-d+i] = temp[i];
		}
	}

	//Time O(n) and space O(1)
	public static void leftRotateWithOptimizedWay(int[] arr, int length, int d) {
		reverse(arr, 0, d-1);
		reverse(arr, d, length-1);
		reverse(arr, 0, length-1);
	}

	public static void reverse(int[] arr, int low, int high) {
		while (low < high){
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
}
