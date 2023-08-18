class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultArray = new ArrayList<>();
        int valueNeeded;

        HashSet<ArrayList<Integer>> uniqueSolutions = new HashSet<>();


        for(int i = 0; i < nums.length; i++){
            
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int j = i+1; j < nums.length; j++){
                valueNeeded = 0 - nums[i] - nums[j];
                if(map.containsKey(valueNeeded)){
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(valueNeeded);
                    Collections.sort(triplet);
                    uniqueSolutions.add(triplet);
                   // System.out.println(triplet);

                    //resultArray.add(triplet);
                }

                map.put(nums[j], j);
            }
        }

        resultArray.addAll(uniqueSolutions);
        return resultArray;
    }
}
