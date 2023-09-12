package com.carlos.datastructuresandalgorithms.TwoPointers;

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String normalString = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        // Although using 2 pointers is more clever, I believe it's still not
        // fast enough. I would rather just reverse the string and compare. its only like 3 lines of code that way and its pretty much just as fast.
        //StringBuilder reversedString = new StringBuilder(normalString).reverse();
        int aPointer = 0;
        int bPointer = normalString.length()-1;

        // clever but I don't think it's as readable as just reversing the string and comparing
        while(aPointer <= bPointer){
            if(normalString.charAt(aPointer) != normalString.charAt(bPointer)){
                return false;
            }

            aPointer++;
            bPointer--;
        }

        return true;
        //return normalString.equals(reversedString.toString());
    }
}
