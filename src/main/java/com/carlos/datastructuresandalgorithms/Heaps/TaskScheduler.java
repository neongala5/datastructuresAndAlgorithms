package com.carlos.datastructuresandalgorithms.Heaps;

import java.util.Arrays;

class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {

        int[] charMap = new int[26];
        for(char task : tasks) {
            charMap[task - 'A']++;
        }

        Arrays.sort(charMap);
        int maxValue = charMap[25] - 1; // - 1 because you dont need to wait on the very last task
        int idleSpots = maxValue * n;

        for(int i = 24; i >= 0; i--) {
            idleSpots -= Math.min(charMap[i], maxValue);
        }

        return idleSpots > 0 ? idleSpots + tasks.length : tasks.length;
    }
}