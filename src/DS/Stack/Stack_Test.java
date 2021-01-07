package DS.Stack;

import java.util.*;

public class Stack_Test {
    public static void main(String[] args){
        Stack<Integer> stack0 = new Stack<>();
        List<Integer> stack01 = new Stack<>();
        List<Integer> stack02 = new ArrayList<>();
        List<Integer> stack03 = new LinkedList<>();

        stack0.push(0);
        stack0.push(1);
        stack0.push(2);
        System.out.println(stack0.pop());
        System.out.println(Arrays.toString(stack0.toArray()));


        stack01.add(0);
        stack01.add(2);
        stack01.add(1,1);
        System.out.println(stack01.remove(0));
        System.out.println(Arrays.toString(stack01.toArray()));

        stack02.add(0);
        stack02.add(1);
        stack02.add(2);
        System.out.println(stack02.remove(0));
        System.out.println(Arrays.toString(stack02.toArray()));

        stack03.add(0);
        stack03.add(1);
        stack03.add(2);
        System.out.println(stack03.remove(0));
        System.out.println(Arrays.toString(stack03.toArray()));

    }
}
