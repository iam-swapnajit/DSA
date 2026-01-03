package dsa.arrays;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/">...</a>
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int x = removeDuplicates(arr);
        System.out.println(x);
    }


    private static int removeDuplicates(int[] arr) {
        int uniqueIndex =0;
        for(int index = 0; index <arr.length; index++){
            if(arr[index] > arr[uniqueIndex]){
                uniqueIndex = uniqueIndex+1;
                arr[uniqueIndex] = arr[index];
            }
        }
        System.out.println(Arrays.toString(arr));
        return  uniqueIndex+1;
    }
}
