package com.carlos.datastructuresandalgorithms.DynamicProgramming;

import java.util.*;

class FibonacciNumber {
    public int fib(int n) {
        HashMap<Integer, Integer> dpCache = new HashMap<>();

        dpCache.put(0,0);
        dpCache.put(1,1);

        return dp(n, dpCache);
    }

    public int dp(int num, HashMap<Integer, Integer> dpCache){
        if(dpCache.containsKey(num)) return (int)dpCache.get(num);

        int value = dp(num-1,dpCache) + dp(num-2, dpCache);

        dpCache.put(num, value);

        return value;
    }
}