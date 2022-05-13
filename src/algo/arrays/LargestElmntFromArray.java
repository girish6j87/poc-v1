package algo.arrays;

public class LargestElmntFromArray {
	public static void main(String[] args) {
		int[] inputArr = new int[]{17,3,1,22,9,10,13};
		System.out.println(getLargestElementFromGivenArray(inputArr));
	}

	public static int getLargestElementFromGivenArray(int[] arr){
		int largestElmnt = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[largestElmnt]) {
				largestElmnt = i;
			}
		}
		return largestElmnt;
	}
}
