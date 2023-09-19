package com.carlos.datastructuresandalgorithms.Heaps;

import java.util.PriorityQueue;
class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        // this heap has a custom comparator using lamba or something. its really neat
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b)->a[1]-b[1]);
        int[][] result = new int[k][2];

        for(int i = 0; i < points.length; i++) {
            // you dont really need to square it. you can compare distance just fine without it.
            // for the exponents. math.pow wouldve made things complicated with doubles.
            // so  just multipy em out
            int distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            maxHeap.offer(new int[] {i, distance});
        }

        for(int i = 0; i < k; i++) {
            result[i] = points[maxHeap.remove()[0]];
        }
        return result;
    }
}