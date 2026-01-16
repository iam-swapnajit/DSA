package dsa.arrays;

/**
 * <a href="https://leetcode.com/problems/single-number/description/">...</a>
 */
public class FindSingleNumber {
    public static void main(String[] args) {

        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int missingNumber = 0;
        for(int num : nums){
            missingNumber = missingNumber ^ num;
        }

        return missingNumber;
    }
}
