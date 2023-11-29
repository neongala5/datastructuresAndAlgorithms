package com.carlos.datastructuresandalgorithms.ArraysAndHashing;

public class ReplaceElementsWithGreatestElementOnTheRightSide {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max = -1;

        for(int i = len - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if(temp > max) max = temp;
        }
        return arr;
    }
}
