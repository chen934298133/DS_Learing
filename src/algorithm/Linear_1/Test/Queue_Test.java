package algorithm.Linear_1.Test;

import algorithm.Linear_1.Queue_Code;

public class Queue_Test {
    public static void main(String[] args){
        Queue_Code<Integer> queue1 = Queue_Code.queue();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        System.out.println(queue1.isEmpty());
        System.out.println("queue.size = " + queue1.size());
        System.out.print("queue.elements : ");
        // 要想在此处使用Integer、String等重点在于继承Iterable时也要带上泛型
        for (Integer i : queue1){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print(queue1.poll());
        System.out.print(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.size());

        Queue_Code<String> queue2 = Queue_Code.queue();
        queue2.add("a");
        queue2.add("b");
        queue2.add("c");
        // 要想在此处使用Integer、String等重点在于继承Iterable时也要带上泛型
        for (String i : queue2){
            System.out.print(i + " ");
        }
    }
}
