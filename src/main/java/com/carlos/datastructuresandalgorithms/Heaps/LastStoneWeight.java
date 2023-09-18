package com.carlos.datastructuresandalgorithms.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones) maxHeap.offer(stone);

        while(maxHeap.size() > 1) {
            maxHeap.offer(Math.abs(maxHeap.remove() - maxHeap.remove()));
        }

        return maxHeap.peek();
    }
}