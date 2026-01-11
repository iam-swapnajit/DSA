package dsa.arrays;

public class MaxConsecutiveCountOfOnes {
    public static void main(String[] args) {
        int[] nums ={1,1,0,1,1,1};
        System.out.println("Maximum Consecutive ones "+findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount =0;
        int currCount =0;

        for (int num : nums) {
            if (num == 1) {
                currCount++;
            } else {
                maxCount = Math.max(maxCount, currCount);
                currCount = 0;
            }
        }
        return Math.max(maxCount,currCount);
    }
}
