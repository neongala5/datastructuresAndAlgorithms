package com.carlos.datastructuresandalgorithms.Heaps;

import java.util.PriorityQueue;

class KthLargestElementInAStream {
    PriorityQueue<Integer> heap = new PriorityQueue<>();

    int largestPosition;

    public KthLargestElementInAStream(int k, int[] nums) {
        largestPosition = k;
        for(int num : nums) {
            heap.add(num);
            if(heap.size() > largestPosition) heap.remove();
        }

    }

    public int add(int val) {
        heap.add(val);
        if(heap.size() > largestPosition) heap.remove();
        return heap.peek();
    }
}