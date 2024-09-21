package com.carlos.datastructuresandalgorithms.Stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        // this is a "monotonic stack" one that is always in decreasing order.
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                temperatures[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) temperatures[stack.pop()] = 0;

        return temperatures;
    }
}