package com.carlos.datastructuresandalgorithms.SlidingWindow;

class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int leftWindow = 0;

        for(int rightWindow = 0; rightWindow < prices.length; rightWindow++){

            maxProfit = Math.max(prices[rightWindow] - prices[leftWindow], maxProfit);

            if(prices[rightWindow] < prices[leftWindow])  leftWindow = rightWindow;

        }

        return maxProfit;
    }
}
