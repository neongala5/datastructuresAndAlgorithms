package com.carlos.datastructuresandalgorithms.Greedy;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // i tried to optimize this to have O(1) space complexity,
        // but i have an older answer that i think is more intuitive
        // but has O(n) space complexity. Both are O(n) time. I think both are good. i might like the older one better since you dont do so much in one for loop.

        int listLength = gas.length;
        int gasSum = 0;
        int costSum = 0;
        int total = 0;
        int solutionIndex = 0;
        int gain = 0;

        for(int i = 0; i < listLength; i++) {
            gasSum += gas[i];
            costSum += cost[i];
            gain = gas[i] - cost[i];

            if(total == 0 && gain > 0) solutionIndex = i;

            total += gain;

            if(total < 0) total = 0;

        }

        return (costSum > gasSum) ? -1 : solutionIndex;
    }
}
