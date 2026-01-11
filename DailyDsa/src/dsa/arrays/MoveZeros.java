package dsa.arrays;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/move-zeroes/submissions/1881416053/">...</a>
 */
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int x =0;
        for(int i=0; i<nums.length ; i++){
            if(nums[i]!=0){
                int temp = nums[x];
                nums[x] = nums[i];
                nums[i] = temp;
                x++;
            }
        }


    }
}
