package com.carlos.datastructuresandalgorithms.DynamicProgramming;

class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        int[] answer = new int[2];

        for(int i = 0; i < length; i++) {
            dp[i][i] = true;
        }

        for(int i = 0; i < length - 1; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                answer[0] = i;
                answer[1] = i + 1;
            }
        }

        for(int diff = 2; diff < length; diff++) {
            for(int i = 0; i < length - diff; i++) {
                int j = i + diff;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) {
                    dp[i][j] = true;
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        int i = answer[0];
        int j = answer[1];
        return s.substring(i, j + 1);
    }
}