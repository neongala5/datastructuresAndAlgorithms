package com.carlos.datastructuresandalgorithms.ArraysAndHashing;

class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()) return false;

        int secondStringPointer = 0;

        for(int i = 0; i < s.length(); i++) {
            if(secondStringPointer >= t.length()) return false;
            while(t.charAt(secondStringPointer) != s.charAt(i)){
                secondStringPointer++;
                if(secondStringPointer >= t.length()) return false;
            }
            secondStringPointer++;
        }
        return true;
    }
}