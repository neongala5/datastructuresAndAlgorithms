package com.carlos.datastructuresandalgorithms.TwoPointers;

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int pointerA = 0;
        int pointerB = height.length - 1;

        while(pointerA < pointerB) {
            max = Math.max(max, (pointerB - pointerA) * Math.min(height[pointerA], height[pointerB]));
            if(height[pointerA] < height[pointerB]) pointerA++;
            else pointerB--;
        }
        return max;
    }
}