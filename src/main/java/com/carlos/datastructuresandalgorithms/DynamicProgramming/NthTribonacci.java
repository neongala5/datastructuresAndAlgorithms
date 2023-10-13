package com.carlos.datastructuresandalgorithms.DynamicProgramming;

import java.util.*;

class NthTribonacci {
    public int tribonacci(int n) {
        HashMap<Integer, Integer> cache = new HashMap<>();

        cache.put(0,0);
        cache.put(1,1);
        cache.put(2,1);

        return dp(n, cache);

    }

    public int dp(int num, HashMap<Integer, Integer> cache) {
        if(cache.containsKey(num)) return cache.get(num);

        int value = dp(num - 1, cache) + dp(num - 2, cache) + dp(num - 3, cache);

        cache.put(num, value);

        return value;
    }
}