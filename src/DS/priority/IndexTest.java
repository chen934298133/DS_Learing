package DS.priority;

import java.util.Arrays;

public class IndexTest {
    public static void main(String[] args) throws Exception {
        IndexMinPriorityQueue<Character> queue = new IndexMinPriorityQueue<>(10);

        queue.insert(0,'1');
        queue.insert(1,'a');
        queue.insert(2,'b');
        queue.insert(3,'c');
        queue.insert(4,'d');
        queue.insert(5,'f');

        System.out.println(Arrays.toString(queue.allToString()));
        System.out.println("queue.size(): " + queue.size());
        System.out.println("queue.isEmpty(): " + queue.isEmpty());
        System.out.println("queue.contains(1): " + queue.contains(1));
        System.out.println("queue.minIndex(): " + queue.minIndex());
        System.out.println("queue.delMin(): " + queue.delMin());
//        System.out.println(queue.contains(5));
//        queue.changeItem(5,'z');
        queue.delete(3);
        System.out.println("delete success");
        queue.changeItem(5,'z');
        System.out.println("change success");
        System.out.println(Arrays.toString(queue.allToString()));

    }
}
