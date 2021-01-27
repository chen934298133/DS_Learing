package DS.Queue;

import java.util.Arrays;
import java.util.LinkedList;

public class Queue_LinkedList {
    public static void main(String[] args){
        LinkedList<Integer> queue = new LinkedList();
        queue.addLast(0);
        queue.addLast(1);
        queue.addLast(2);
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(queue.pollFirst());
        System.out.println(Arrays.toString(queue.toArray()));
    }
}
