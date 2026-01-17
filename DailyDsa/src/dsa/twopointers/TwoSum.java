package dsa.twopointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/submissions/1887418365/">...</a>
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {4,3,7,2};
        int target = 6;
        int[] elements = twoSum(nums, target);
        System.out.println(Arrays.toString(elements));

    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> meta = new HashMap<>();

        for(int i =0 ; i<nums.length ; i++){
            if(meta.containsKey(target-nums[i])){
                return new int[]{i, meta.get(target-nums[i])};
            }else{
                meta.put(nums[i],i);
            }
        }

        return new int[]{-1,-1};
    }
}
