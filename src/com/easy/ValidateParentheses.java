package com.easy;

import java.util.Stack;

public class ValidateParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[[]{}]{}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> bkt = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                bkt.push(')');
            } else if (ch == '{') {
                bkt.push('}');
            } else if (ch == '[') {
                bkt.push(']');
            } else if ( bkt.isEmpty() || bkt.pop() != ch ) {
                return false ;
            }
        }
        return bkt.isEmpty();
    }
}
