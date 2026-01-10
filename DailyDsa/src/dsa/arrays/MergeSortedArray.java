package dsa.arrays;

import java.util.Arrays;

public class MergeSortedArray {
    /**
     * <a href="https://leetcode.com/problems/merge-sorted-array/description/">...</a>
     */
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n=3;
        mergeWithoutUsingNewArray(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = Arrays.copyOfRange(nums1,0,  m);
        int ptr1 = 0;
        int ptr2 =0;

        for(int i=0; i<m+n ; i++){
            if(ptr2>=n || (ptr1<m && nums1Copy[ptr1]<nums2[ptr2])){
                nums1[i] =  nums1Copy[ptr1];
                ptr1++;

            }
            else {
                nums1[i] = nums2[ptr2];
                ptr2++;
            }
        }

    }

    public static void mergeWithoutUsingNewArray(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1;
        int ptr2 =n-1;

        for(int i=m+n-1; i>=0 ; i--){
            if(ptr2<0) break;// Means nums2 already been traversed and the remaining in nums1 is already sorted
            if(ptr1>=0 && nums1[ptr1]>nums2[ptr2]){
                nums1[i] =  nums1[ptr1];
                ptr1--;

            }
            else {
                nums1[i] = nums2[ptr2];
                ptr2--;
            }
        }
        System.out.println(Arrays.toString(nums1));

    }
}
