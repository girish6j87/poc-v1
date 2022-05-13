package algo.exp;

import java.util.Arrays;

/**
 * @author Girish Pathak
 * @version 1.0
 */
//Best: O(n) time | O(1) space
//Average: O(n^2) time | O(1) space
//Worst: O(n^2) time | O(1) space

public class BubbleSort {
    public static int[] bubbleSort(int[] array){
        if(array.length==0){
            return new int[]{};
        }
        boolean isSorted = false;
        int count = 0;
        while (!isSorted){
            isSorted = true;
            for(int i=0;i< array.length-1-count;i++){
                if(array[i]>array[i+1]){
                    isSorted = false;
                    swap(i,i+1,array);
                }
            }
            count+=1;
        }
        return array;
    }

    private static void swap(int i, int i1, int[] array) {
        int temp = array[i1];
        array[i1] = array[i];
        array[i]=temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{12,3,42,6,8,5,2})));
    }
}
