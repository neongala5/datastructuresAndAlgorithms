package com.carlos.datastructuresandalgorithms.ArraysAndHashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        // Although there may be faster solutions, i was trying to stick to strictly using hashmaps
        // and arrays for this one. I was forced to also write my own comparator too so that was a
        // good thing to learn about.
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for(int num : nums){
            if(countMap.containsKey(num)){
                countMap.put(num,countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }

        }
        ArrayList<ArrayList<Integer>> countArray = new ArrayList<>();

        for(HashMap.Entry<Integer,Integer> entry : countMap.entrySet()){
            ArrayList<Integer> pairs = new ArrayList<>();
            pairs.add(entry.getKey());
            pairs.add(entry.getValue());
            countArray.add(pairs);
        }

        // this is the first time i had to make my own comparator. its cool.
        Comparator<ArrayList<Integer>> compareByValue = new Comparator<>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                //it compares the values of the key value pairs. thats why its index 1 and not index 0
                return o1.get(1).compareTo(o2.get(1));
            }
        };

        // reversed so i get the array in descending order
        Collections.sort(countArray, compareByValue.reversed());

        int[] solutionArray = new int[k];
        for(int i =0;i<k;i++){
            solutionArray[i] = countArray.get(i).get(0);
        }

        // Will keep the print statement for documentation purposes.
        System.out.println(countArray);
        return solutionArray;
    }
}