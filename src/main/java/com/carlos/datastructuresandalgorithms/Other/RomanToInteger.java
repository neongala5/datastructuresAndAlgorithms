package com.carlos.datastructuresandalgorithms.Other;

class RomanToInteger {

    // Performs well but could be improved for readibility and to not have tons of hardcoded numbers everywhere.
    public int romanToInt(String s) {
        int sum = 0;

        int length = s.length();

        for(int i = 0; i < length; i++) {
            switch(s.charAt(i)){
                case 'I': {

                    if(i < length - 1) {
                        if(s.charAt(i+1) == 'V') {
                            sum += 4;
                            i++;
                        } else if( s.charAt(i+1) == 'X') {
                            sum += 9;
                            i++;
                        } else {
                            sum += 1;
                        }
                        break;
                    }

                    sum += 1;
                    break;
                }
                case 'V': sum += 5; break;
                case 'X': {
                    if(i < length - 1) {
                        if(s.charAt(i+1) == 'L') {
                            sum += 40;
                            i++;
                        } else if( s.charAt(i+1) == 'C') {
                            sum += 90;
                            i++;
                        } else {
                            sum += 10;
                        }
                        break;
                    }
                    sum += 10;
                    break;
                }
                case 'L': sum += 50; break;
                case 'C': {
                    if(i < length - 1) {
                        if(s.charAt(i+1) == 'D') {
                            sum += 400;
                            i++;
                        } else if( s.charAt(i+1) == 'M') {
                            sum += 900;
                            i++;
                        } else {
                            sum += 100;
                        }
                        break;
                    }

                    sum += 100;
                    break;
                }
                case 'D': sum += 500; break;
                case 'M': sum += 1000; break;
            }
        }
        return sum;
    }
}