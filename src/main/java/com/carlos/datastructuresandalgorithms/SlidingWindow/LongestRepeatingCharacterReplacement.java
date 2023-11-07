package com.carlos.datastructuresandalgorithms.SlidingWindow;

class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] charCounts = new int[26];
        int len =  s.length();

        int left = 0;
        int maxLength = 0;
        int maxSize = 0;

        for(int right = 0; right < len; right++) {
            charCounts[s.charAt(right) - 'A']++;
            maxSize = Math.max(maxSize,charCounts[s.charAt(right) - 'A']);

            while(right - left - maxSize + 1 > k) {
                charCounts[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left +1);
        }

        return maxLength;
    }
}