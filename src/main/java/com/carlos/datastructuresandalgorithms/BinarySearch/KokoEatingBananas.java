package com.carlos.datastructuresandalgorithms.BinarySearch;

class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        // numbers in general are ordered, so you can do a binary search on
        // numbers themselves.
        // We are just guessing, then guessing better and better until we find a good one.

        int left = 0;
        int right = Integer.MAX_VALUE;
        int midPoint = (left + right) / 2;
        int time = 0;
        while(left <= right) {
            time = 0;
            midPoint = (left + right) / 2;

            for(int pile : piles) {
                // dividing will give the "floor", i want the "ceiling"
                time += Math.ceil((double)pile/(double)midPoint);
            }

            if(left == right) break;

            if(time == h) right = midPoint;
            else if(time > h) left = midPoint + 1;
            else if(time < h) right = midPoint;

        }
        return midPoint;
    }
}
