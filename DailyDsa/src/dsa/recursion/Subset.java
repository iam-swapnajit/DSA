package dsa.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/subsets/">...</a>
 *
 */
public class Subset {

    static List<List<Integer>> listOfSubsets = new ArrayList<>();
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        List<List<Integer>> listOfSubsets = subsets(arr);

        System.out.println(listOfSubsets);

    }

    public static List<List<Integer>> subsets(int[] nums) {

        helper(nums, 0, new ArrayList<>());

        return listOfSubsets;
    }

    private static void helper(int[] arr, int i, ArrayList<Integer> combinationSoFar) {
        //base case
        if(i == arr.length){
            listOfSubsets.add(new ArrayList<>(combinationSoFar));
            return;
        }
        //do not pick the element
        helper(arr, i+1, combinationSoFar);
        //pick the current element
        combinationSoFar.add(arr[i]);
        helper(arr, i+1, combinationSoFar);
        combinationSoFar.removeLast();

    }
}
