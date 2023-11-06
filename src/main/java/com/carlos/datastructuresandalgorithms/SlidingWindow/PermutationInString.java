package com.carlos.datastructuresandalgorithms.SlidingWindow;

import java.util.*;

class PermutationInString {
    // to be fair all the other solutions are pretty long and hard to understand too. This is what i came up with and i think its just as good.
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> letterMap = new HashMap<>();
        for(int i = 0; i < s1.length(); i++) {
            Character currentChar = s1.charAt(i);
            if(letterMap.containsKey(currentChar)) {
                letterMap.put(currentChar, letterMap.get(currentChar) + 1);
            } else {
                letterMap.put(currentChar, 1);
            }
        }

        int leftWindow = 0;
        int rightWindow = 0;

        while(rightWindow < s2.length()) {
            if(rightWindow - leftWindow < s1.length()) {
                Character currentChar = s2.charAt(rightWindow);
                if(letterMap.containsKey(currentChar)) letterMap.put(currentChar, letterMap.get(currentChar) - 1 );
                rightWindow++;
            } else {
                Character currentChar = s2.charAt(rightWindow);
                if(letterMap.containsKey(currentChar)) letterMap.put(currentChar, letterMap.get(currentChar) - 1 );
                rightWindow++;

                currentChar = s2.charAt(leftWindow);
                if(letterMap.containsKey(currentChar)) letterMap.put(currentChar, letterMap.get(currentChar) + 1 );
                leftWindow++;
            }

            //i'm using this to check if everything is 0, meaning theres a match
            boolean result = true;
            for(HashMap.Entry<Character, Integer> entry : letterMap.entrySet()){
                if(entry.getValue() != 0) result = false;
            }
            if(result) return result;
        }

        return false;
    }
}