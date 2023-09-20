package com.carlos.datastructuresandalgorithms.Heaps;

import java.util.PriorityQueue;
class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        // does putting it in a priority queue (heap) count as sorting? NO.
        // Its supposed to be a"quick select" problem (whatever that is. i Just use a heap)
        // its okay as long as you dont actually sort anything.
        // since its a minheap, if your heap is k elements big,
        // then the root will be the "kth largest element"
        // or the smallest of all the biggest numbers if that makes any sense.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int number: nums){
            minHeap.add(number);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }
        return minHeap.remove();
    }
}