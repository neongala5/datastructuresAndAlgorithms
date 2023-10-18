package com.carlos.datastructuresandalgorithms.Other;

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        int size = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            if(size > 0 && s.charAt(i) == ' ') break;
            if(s.charAt(i) == ' ') continue;
            size++;
        }


        return size;
    }
}