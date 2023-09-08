package com.carlos.datastructuresandalgorithms.SlidingWindow;

import java.util.HashSet;

class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> letterSet = new HashSet<>();
        int maxLength = 0;

        int left = 0;

        for(int right = 0; right < s.length(); right++) {
            if(letterSet.add(s.charAt(right))){
                maxLength = Math.max(maxLength, letterSet.size());
            }
            else{
                while(!letterSet.add(s.charAt(right))) {
                    letterSet.remove(s.charAt(left));
                    left++;
                }
            }
        }
        return maxLength;
    }
}