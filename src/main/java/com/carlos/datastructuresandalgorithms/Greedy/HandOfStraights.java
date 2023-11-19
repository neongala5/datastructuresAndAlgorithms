package com.carlos.datastructuresandalgorithms.Greedy;

import java.util.*;

public class HandOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // dont really know how this is supposed to be a greedy problem
        if(hand.length % groupSize != 0) return false;
        //its like a priority queue of hashmaps. Can even use priority queue here but tree map is simpler to read.
        TreeMap<Integer, Integer> cardCounts = new TreeMap<>();

        for(int card : hand) {
            if(cardCounts.containsKey(card)) cardCounts.put(card, cardCounts.get(card) + 1);
            else cardCounts.put(card, 1);
        }

        while(!cardCounts.isEmpty()) {
            int startCard = cardCounts.firstKey();
            for(int card = startCard; card < startCard + groupSize; card++) {
                if(!cardCounts.containsKey(card)) return false;
                cardCounts.put(card, cardCounts.get(card)-1);

                if(cardCounts.get(card) == 0) cardCounts.remove(card);
            }
        }
        return true;
    }
}
