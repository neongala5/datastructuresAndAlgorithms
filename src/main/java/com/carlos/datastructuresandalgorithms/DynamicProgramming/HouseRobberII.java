package com.carlos.datastructuresandalgorithms.DynamicProgramming;

class HouseRobberII {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];

        int[] maxMoney = new int[nums.length+1];

        maxMoney[0] = 0;
        maxMoney[1] = 0;
        maxMoney[2] = nums[1];

        for(int i = 2; i < nums.length; i++) {
            maxMoney[i+1] = Math.max(maxMoney[i], maxMoney[i-1] + nums[i]);
        }


        int[] maxMoneyTwo = new int[nums.length + 1];

        maxMoneyTwo[0] = 0;
        maxMoneyTwo[1] = nums[0];

        for(int i = 1; i < nums.length-1; i++) {
            maxMoneyTwo[i+1] = Math.max(maxMoneyTwo[i], maxMoneyTwo[i-1] + nums[i]);
        }

        return Math.max(maxMoneyTwo[maxMoneyTwo.length - 2], maxMoney[maxMoney.length - 1]);

    }
}