package DS.Stack;

import java.util.Deque;
import java.util.LinkedList;

public class Stack_LinkedList_Deque {
    public static void main(String[] args){
        Deque stack = new LinkedList<Integer>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
    }
}
