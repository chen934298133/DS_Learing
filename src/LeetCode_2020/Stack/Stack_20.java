package LeetCode_2020.Stack;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Stack_20 {
    public static void main(String[] args){
        Stack_20 stack_20 = new Stack_20();
        String s0 = "{(})";
        String s1 = "))";
        String s2 = "}{";
        String s3 = "{()}";
        System.out.println("s0: "+stack_20.isValid(s0));
        System.out.println("s1: "+stack_20.isValid(s1));
        System.out.println("s2: "+stack_20.isValid(s2));
        System.out.println("s3: "+stack_20.isValid(s3));
    }
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
