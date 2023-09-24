package com.carlos.datastructuresandalgorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;

class CombinationSum {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0, new ArrayList<Integer>(), candidates, target);
        return result;
    }

    public void backtrack(int first, ArrayList<Integer> curr, int[] candidates, int targetRemainder) {
        if(targetRemainder < 0) return;
        if(targetRemainder == 0) result.add(new ArrayList<Integer>(curr));

        for(int i = first; i < candidates.length; i++) {
            curr.add(candidates[i]);

            // Seems like for examples where you can reuse elements, dont do i + 1, just do i.
            backtrack(i, curr, candidates, targetRemainder - candidates[i]);

            curr.remove(curr.size() - 1);
        }
    }
}
