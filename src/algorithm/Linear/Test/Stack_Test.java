package algorithm.Linear.Test;

import algorithm.Linear.Stack_Code;

public class Stack_Test {
    public static void main(String[] args){
        Stack_Code<String> stack = Stack_Code.stack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        {
            System.out.print("Stack.size = " + stack.size());
            System.out.print("     Element:");
            for (Object i : stack){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Stack.pop = " + stack.pop());

        {
            System.out.print("Stack.size = " + stack.size());
            System.out.print("     Element:");
            for (Object i : stack){
                System.out.print(i + " ");
            }
        }

    }
}
