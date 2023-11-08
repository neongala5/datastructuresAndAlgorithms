package com.carlos.datastructuresandalgorithms.SlidingWindow;

import java.util.*;

class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        //second successful hard problem. All the answers are long and complex, so i think my solution is okay too.
        // i bet it would be faster if i used arrays instead of hashmaps? who knows

        HashMap<Character, Integer> letterMap = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            Character currentChar = t.charAt(i);
            letterMap.put(currentChar, letterMap.getOrDefault(currentChar, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int minLeft = 0;
        int minRight = 0;
        int minSize = Integer.MAX_VALUE;

        while(right <= s.length()) {
            boolean isSubstring = true;
            for(Map.Entry<Character, Integer> entry : letterMap.entrySet()) {
                if(entry.getValue() > 0) isSubstring = false;
            }
            if(isSubstring) {
                if((right - left) < minSize){
                    minSize = right - left;
                    minLeft = left;
                    minRight = right;
                }

                Character leftChar = s.charAt(left);
                if(letterMap.containsKey(leftChar)) {
                    letterMap.put(leftChar, letterMap.get(leftChar) + 1);
                }
                left++;
            } else {
                if(right == s.length()) break;
                Character currentChar = s.charAt(right);
                if(letterMap.containsKey(currentChar)) {
                    letterMap.put(currentChar, letterMap.get(currentChar) - 1);
                }
                right++;
            }
        }

        if(minSize == Integer.MAX_VALUE) return "";
        else return s.subSequence(minLeft, minRight).toString();
    }
}