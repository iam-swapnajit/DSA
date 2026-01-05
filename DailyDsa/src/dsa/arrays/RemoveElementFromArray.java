package dsa.arrays;

/**
 * <a href="https://leetcode.com/problems/remove-element/">...</a>
 */
public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,3,4,8,3};
        System.out.println(removeElement(nums, 3));
    }
    public static int removeElement(int[] nums, int val) {
        int x = 0;
        for(int index=0 ; index< nums.length; index++){
            if(nums[index] != val){
                nums[x] = nums[index];
                x = x + 1;
            }
        }
        return x ;
    }
}
