package algo.exp;


import com.sun.istack.internal.Nullable;

import java.util.Arrays;

/**
 * @author Girish Pathak
 * @version 1.0
 */
//Best: O(n) time | O(1) space
//Average: O(n^2) time | O(1) space
//Worst: O(n^2) time | O(1) space

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{12,4,3,2,6,9,5,1})));
    }
    public static int[] insertionSort(int[] array){
        if(array.length == 0){
            return new int[]{};
        }
        for (int i=1; i<array.length; i++){
            int j = i;
            while (j>0 && array[j] < array[j-1]){
                swap(j,j-1,array);
                j-=1;
            }
        }
        return array;
    }

    private static void swap(int j, int i, int[] array) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
