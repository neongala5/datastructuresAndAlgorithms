package com.carlos.datastructuresandalgorithms.Stack;

import java.util.Collections;
import java.util.TreeMap;

class CarFleets {
    public int carFleet(int target, int[] position, int[] speed) {
        // Supposedly youre supposed to use a monotonic stack for this.
        // But why in the world would i wanna use a stack for this? i think its more intuitive without using one. Like so:
        TreeMap<Integer, Integer> cars = new TreeMap<Integer, Integer>(Collections.reverseOrder());
        for(int i = 0; i < position.length; i++) cars.put(position[i], speed[i]);

        double previousTimeToFinish = -1;

        int fleetCount = 0;

        for(Integer key : cars.keySet()){
            double currentTimeToFinish = (double)(target - key) / (double)cars.get(key);

            if(currentTimeToFinish > previousTimeToFinish){
                previousTimeToFinish = currentTimeToFinish;
                fleetCount++;
            }
        }

        return fleetCount;
    }
}