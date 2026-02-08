package dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PowersetBacktracking {

    /**
     * Generates all possible subsets of a given array using backtracking.
     * @param nums The input array of integers.
     * @return A list of lists, where each inner list is a subset.
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Start the backtracking process with an empty temporary list and starting index 0.
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    /**
     * The recursive backtracking helper function.
     * @param result The final list to store all subsets.
     * @param tempList The current subset being built.
     * @param nums The original input array.
     * @param start The starting index for the current recursion level.
     */
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        // Add the current temporary list to the final result list.
        // A new ArrayList is created to store a snapshot of the current subset.
        result.add(new ArrayList<>(tempList));

        // Iterate through the remaining elements in the array
        for (int i = start; i < nums.length; i++) {
            // Case 1: Include the current element
            tempList.add(nums[i]);
            // Recurse with the updated temporary list and the next index (i + 1)
            backtrack(result, tempList, nums, i + 1);
            // Case 2: Exclude the current element (backtrack)
            // Remove the last added element to explore other possibilities
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        PowersetBacktracking solution = new PowersetBacktracking();
        int[] nums = {1, 2, 3};
        List<List<Integer>> allSubsets = solution.subsets(nums);

        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Power Set (All Subsets):");
        for (List<Integer> subset : allSubsets) {
            System.out.println(subset);
        }
        System.out.println("Total number of subsets: " + allSubsets.size()); // Should be 2^n
    }
}

