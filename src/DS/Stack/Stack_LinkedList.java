package DS.Stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Stack_LinkedList {
    public static void main(String[] args){
        LinkedList<Integer> stack = new LinkedList<>();
        stack.add(0);
        stack.add(1);
        stack.add(2);
        System.out.println(Arrays.toString(stack.toArray()));
//        System.out.println(stack.pollFirst());
        int tmp = stack.pollFirst();
        System.out.println(tmp);
//        System.out.println(stack.pollLast());
        System.out.println(Arrays.toString(stack.toArray()));
    }
}
