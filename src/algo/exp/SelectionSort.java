package algo.exp;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Girish Pathak
 * @version 1.0
 */
//Best: O(n^2) time | O(1) space
//Average: O(n^2) time | O(1) space
//Worst: O(n^2) time | O(1) space

public class SelectionSort {
    public static void main(String[] args) {
        Arrays.stream(selectionSort(new int[]{3,2,9,8,4,5,1})).forEach(System.out::print);
        //Stream.of(selectionSort(new int[]{3,2,9,8,4,5,1})).forEach(System.out::println);
        System.out.println(Arrays.toString(selectionSort(new int[]{4,3,6,1,2,7,9,8})));
        //Arrays.asList(selectionSort(new int[]{4,3,6,1,2,7,9,8})).stream().forEach(s -> System.out.println(s));
    }
    public static int[] selectionSort(int[] array){
        if(array.length == 0){
            return new int[]{};
        }
        int startIdx = 0;
        while (startIdx < array.length-1){
            int smallestIdx = startIdx;
            for (int i = startIdx+1; i < array.length; i++) {
                if(array[smallestIdx] > array[i]) {
                    smallestIdx = i;
                }
            }
            swap(startIdx,smallestIdx,array);
            startIdx++;
        }
        return array;
    }

    private static void swap(int startIdx, int smallestIdx, int[] array) {
        int temp = array[smallestIdx];
        array[smallestIdx] = array[startIdx];
        array[startIdx] = temp;
    }
}
