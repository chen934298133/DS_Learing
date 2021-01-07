package LeetCode_2020.Stack;

import java.util.LinkedList;

public class Stack_20_baoli {
    public static void main(String[] args){
        String s0 = "{(})";
        String s1 = "))";
        String s2 = "}{";
        String s3 = "{()}";
        Stack_20_baoli stack_20 = new Stack_20_baoli();
        System.out.println("s0: "+stack_20.isValid(s0));
        System.out.println("s1: "+stack_20.isValid(s1));
        System.out.println("s2: "+stack_20.isValid(s2));
        System.out.println("s3: "+stack_20.isValid(s3));
    }

    public boolean isValid(String s){
        int n = s.length();
        if(n % 2 == 1) return false;

        LinkedList<Character> stack1 = new LinkedList();
        LinkedList<Character> stack2 = new LinkedList();
        LinkedList<Character> stack3 = new LinkedList();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            switch (ch){
                case '(':
                    stack1.addLast(ch);
                    break;
                case ')':
                    if (stack1.isEmpty()){
                        return false;
                    }else {
                        stack1.pollLast();
                    break;
                    }

                case '{':
                    stack2.addLast(ch);
                    break;
                case '}':
                    if (stack2.isEmpty()){
                        return false;
                    }else {
                        stack2.pollLast();
                        break;
                    }

                case '[':
                    stack3.addLast(ch);
                    break;
                case ']':
                    if (stack3.isEmpty()){
                        return false;
                    }else {
                        stack3.pollLast();
                        break;
                    }
                default:
                    break;

            }
        }
            if(stack1.isEmpty() && stack2.isEmpty() && stack3.isEmpty()){
                return true;
            }else {
                return false;
            }
    }
}
