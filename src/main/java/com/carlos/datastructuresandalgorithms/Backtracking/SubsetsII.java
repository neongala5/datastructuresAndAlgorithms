package com.carlos.datastructuresandalgorithms.Backtracking;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class SubsetsII {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // sorting helps a lot in this example, and allows for the better duplicate check too.
        Arrays.sort(nums);
        backtrack(0, new ArrayList<Integer>(), nums);
        return result;
    }

    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        result.add(new ArrayList<Integer>(curr));

        for(int i = first; i < nums.length; i++) {
            // this line checks for duplicates. its pretty clever.
            if(i != first && nums[i] == nums[i - 1 ]) continue;

            curr.add((nums[i]));
            int next = i +1;
            backtrack(next, curr, nums);
            curr.remove(curr.size() -1);
        }
    }
}