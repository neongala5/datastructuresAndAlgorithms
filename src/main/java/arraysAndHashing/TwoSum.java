package arraysAndHashing;

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] solution = new int[2];
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                solution[0] = i;
                solution[1] = map.get(target-nums[i]);
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return solution;
    }
}