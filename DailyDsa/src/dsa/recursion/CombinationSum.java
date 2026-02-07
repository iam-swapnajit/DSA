package dsa.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/combination-sum/description/">...</a>
 */
public class CombinationSum {
    static  List<List<Integer>>  finalAns = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {2,3,5};
        System.out.println(combinationSum(arr, 8));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, 0, target, new ArrayList<>());
        return finalAns;
    }

    private static void helper(int[] candidates, int index, int target, ArrayList<Integer> combinationSofar) {
        if(target == 0){
            finalAns.add(new ArrayList<>(combinationSofar));
            return;
        }
        if(index == candidates.length || target<0){
            return;
        }
        //Don't pick the element
        helper(candidates, index+1, target, combinationSofar);
        //Pick the element
        combinationSofar.add(candidates[index]);
        helper(candidates, index, target-candidates[index], combinationSofar);
        combinationSofar.removeLast();


    }
}
