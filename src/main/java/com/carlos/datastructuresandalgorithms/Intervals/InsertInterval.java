package com.carlos.datastructuresandalgorithms.Intervals;

import java.util.*;

public class InsertInterval {
    // this is a nice solution, but one thing that i dont like is that
    // "newInterval" eventually gets set to stuff that isnt the new interval at all
    // so its less legible. Maybe an added variable with a better name can fix that?
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        for(int i = 0; i < intervals.length; i++) {
            int[] currInterval = intervals[i];

            if(currInterval[1] < newInterval[0]) result.add(currInterval);
            else if(currInterval[0] > newInterval[1]) {
                result.add(newInterval);
                newInterval = currInterval;
            } else {
                newInterval[0]=Math.min(currInterval[0],newInterval[0]);
                newInterval[1]=Math.max(currInterval[1],newInterval[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][]);
    }
}
