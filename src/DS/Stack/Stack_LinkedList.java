package DS.Stack;

import java.util.Arrays;
import java.util.LinkedList;

public class Stack_LinkedList {
    public static void main(String[] args){
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addFirst(0);
        stack.addFirst(1);
        stack.addFirst(2);
        System.out.println(Arrays.toString(stack.toArray()));
        int tmp = stack.pollFirst();
        System.out.println(tmp);
        System.out.println(Arrays.toString(stack.toArray()));
    }
}
