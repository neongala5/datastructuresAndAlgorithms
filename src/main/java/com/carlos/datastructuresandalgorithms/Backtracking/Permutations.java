package com.carlos.datastructuresandalgorithms.Backtracking;

import java.util.List;
import java.util.ArrayList;
class Permutations {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(new ArrayList<Integer>(), nums);
        return result;
    }

    public void backtrack(ArrayList<Integer> curr, int[] nums) {
        if(curr.size() == nums.length){
            result.add(new ArrayList<Integer>(curr));
            return;
        }

        for(int num : nums) {
            if(!curr.contains(num)) {
                curr.add(num);
                backtrack(curr, nums);
                curr.remove(curr.size() - 1);
            }
        }
    }
}