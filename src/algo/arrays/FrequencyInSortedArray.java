package algo.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyInSortedArray {
	public static void main(String[] args) {
		int[] arr = new int[]{10,10,10,12,13,14,14,15,18};
		//getFrequency(arr, arr.length);
		System.out.println(getFrequencyWithOptimizedSol(arr,arr.length));
	}
	//Time O(n) | Space O(1)
	static void getFrequency(int[] arr, int n){
		int frequency = 1;
		int i = 1;
		while (i < n) {
			while (i < n && arr[i] == arr[i-1]) {
				frequency++;
				i++;
			}
			System.out.println(arr[i-1] + ": " + frequency);
			i++;
			frequency = 1;
		}
		if(n==1 || arr[n-1] != arr[n-2] ){
			System.out.println(arr[n-1] +": "+1);
		}
	}
	static Map<Integer,Integer> getFrequencyWithOptimizedSol(int[] arr, int n){
		Map<Integer,Integer> freqMap = new HashMap<>();
		for(int i=0; i<n; i++){
			if(freqMap.containsKey(arr[i])){
				freqMap.put(arr[i],freqMap.get(arr[i])+1);
			}else {
				freqMap.put(arr[i],1);
			}
		}
		return freqMap;
	}
}
