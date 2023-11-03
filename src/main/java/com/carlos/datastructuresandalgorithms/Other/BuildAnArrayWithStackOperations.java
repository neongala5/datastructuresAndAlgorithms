package com.carlos.datastructuresandalgorithms.Other;

import java.util.*;

class BuildAnArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();

        for(int i = 0; i < target[0] - 1; i++) {
            result.add("Push");
            result.add("Pop");
        }

        result.add("Push");

        for(int i = 1; i < target.length; i++) {
            for(int j = 0; j < target[i] - target[i-1] - 1 ; j++) {
                result.add("Push");
                result.add("Pop");
            }
            result.add("Push");
        }

        return result;
    }
}