package algorithm.Linear_1.Test;

import algorithm.Linear_1.Stack_Code;

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
            // 要想在此处使用Integer、String等重点在于继承Iterable时也要带上泛型
            for (String i : stack){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("Stack.pop = " + stack.pop());

        {
            System.out.print("Stack.size = " + stack.size());
            System.out.print("     Element:");
            // 要想在此处使用Integer、String等重点在于继承Iterable时也要带上泛型
            for (String i : stack){
                System.out.print(i + " ");
            }
        }

    }
}
