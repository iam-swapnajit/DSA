package dsa.arrays;

/**
 * <a href="https://leetcode.com/problems/missing-number/description/">...</a>
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;

        for (int num : nums) {
           sum = sum - num;
        }
        return sum;

    }
}
