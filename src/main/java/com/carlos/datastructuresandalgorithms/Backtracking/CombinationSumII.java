package com.carlos.datastructuresandalgorithms.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CombinationSumII {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(0, new ArrayList<Integer>(), candidates, target);
        return result;

    }

    public void backtrack(int first, ArrayList<Integer> curr, int[] candidates, int remainder) {
        if(remainder == 0) {
            result.add(new ArrayList<Integer>(curr));
            return;
        }

        if( remainder < 0) return;

        for(int i = first; i < candidates.length; i++) {
            if(i != first && candidates[i] == candidates[i-1]) continue;

            // this next line is just to make it faster.
            // makes go from 75% faster, to 100% faster than everyone else with this line.
            if(remainder - candidates[i] < 0) break;

            curr.add(candidates[i]);
            backtrack(i + 1, curr, candidates, remainder - candidates[i]);
            curr.remove(curr.size() - 1);
        }
    }
}