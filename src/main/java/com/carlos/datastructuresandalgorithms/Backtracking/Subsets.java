package com.carlos.datastructuresandalgorithms.Backtracking;

import java.util.ArrayList;
import java.util.List;

class Subsets {
    List<List<Integer>> result = new ArrayList<>();
    int length = 0;

    public List<List<Integer>> subsets(int[] nums) {
        length = nums.length;
        backtrack(0, new ArrayList<Integer>(), nums);
        return result;
    }

    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        result.add(new ArrayList<Integer>(curr));

        for(int i = first; i < length; i++) {
            curr.add(nums[i]);

            backtrack(i + 1, curr, nums);

            curr.remove(curr.size() -1);
        }
    }
}