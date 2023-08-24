package com.carlos.datastructuresandalgorithms.Stack;

import java.util.Stack;

class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();
        int second;
        int first;

        for(String token : tokens){
            if(token.equals("+")){
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(first + second));
            } else if(token.equals("-")){
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(first - second));
            } else if(token.equals("*")){
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(first * second));
            } else if(token.equals("/")){
                second = Integer.parseInt(stack.pop());
                first = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(first / second));
            }else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}