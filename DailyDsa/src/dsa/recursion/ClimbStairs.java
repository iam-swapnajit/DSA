package dsa.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode problem number 70
 *
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbStairs {
    public static void main(String[] args) {
        int n = 2 ;
        System.out.println("Number of ways to climb " +n +" steps is "+ climbStairs(n));
        System.out.println("Number of ways to climb " +n +" steps is "+ climbStairsUsingDP(n));
    }

    /**
     *
     * This will run into Time Limit Exceeded error
     *
     */
    private static int climbStairs(int n) {
        if(n <= 1)
            return 1;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    static Map<Integer, Integer> cache = new HashMap<>();

    /**
     * Optimized code using DP
     */
    private static int climbStairsUsingDP(int n) {
        if(n <= 1)
            return 1;
        if(cache.containsKey(n))
            return cache.get(n);
        int steps = climbStairs(n-1) + climbStairs(n-2);
        cache.put(n, steps);
        return steps;
    }
}
