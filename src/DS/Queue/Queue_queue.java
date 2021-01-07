package DS.Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Queue_queue {
    public static void main(String[] args){
        Queue queue = new ArrayDeque();
        queue.add(0);
        queue.add(1);
        queue.add(2);
        System.out.println(queue.poll());
        System.out.println(Arrays.toString(queue.toArray()));

    }
}
