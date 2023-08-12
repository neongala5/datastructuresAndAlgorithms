package arraysAndHashing;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] myList = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int k =i+1;i<nums.length-1;k++){
                if(k>=nums.length){
                    break;
                }
                if(nums[i]+nums[k]==target){
                    myList[0] = i;
                    myList[1] = k;

                    return myList;
                }
            }
        }
        return myList;
    }
}