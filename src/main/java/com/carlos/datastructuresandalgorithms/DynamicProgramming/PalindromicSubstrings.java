package com.carlos.datastructuresandalgorithms.DynamicProgramming;

class PalindromicSubstrings {
    public int countSubstrings(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int answer = 0;

        for(int i = 0; i < len; i++) {
            dp[i][i] = true;
            answer++;
        }

        for(int i = 0; i < len - 1; i++) {
            if(s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                answer++;
            }
        }

        for(int diff = 2; diff < len; diff++) {
            for(int i = 0; i < len - diff; i++) {
                int j = i + diff;
                if(dp[i+1][j-1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    answer++;
                }
            }
        }

        return answer;
    }
}