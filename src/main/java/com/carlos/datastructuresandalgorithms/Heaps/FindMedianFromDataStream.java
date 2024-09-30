package com.carlos.datastructuresandalgorithms.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class FindMedianFromDataStream {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public FindMedianFromDataStream() {
        left = new PriorityQueue<>(Collections.reverseOrder());
        right = new PriorityQueue<>();

    }

    public void addNum(int num) {
        left.add(num);

        right.add(left.poll());

        if(left.size() < right.size()) left.add(right.poll());

    }

    public double findMedian() {
        if(left.size() == right.size()){
            return (left.peek() + right.peek()) / 2.0;
        } else return left.peek();
    }
}