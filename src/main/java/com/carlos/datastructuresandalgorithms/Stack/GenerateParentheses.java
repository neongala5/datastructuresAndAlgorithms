package com.carlos.datastructuresandalgorithms.Stack;

import java.util.ArrayList;
import java.util.List;

class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> results = new ArrayList<>();
        backtracker(n, results, "", 0, 0);
        return results;
    }

    public ArrayList<String> backtracker(int maxPairs, ArrayList<String> results, String currentString, int leftParenthTotal, int rightParenthTotal){
        if(currentString.length() == maxPairs *2){
            results.add(currentString);
        }
        if(leftParenthTotal < maxPairs){
            backtracker(maxPairs, results, currentString + "(", leftParenthTotal + 1, rightParenthTotal);
        }
        if(rightParenthTotal < leftParenthTotal){
            backtracker(maxPairs, results, currentString + ")", leftParenthTotal, rightParenthTotal + 1);
        }
        return results;
    }
}
