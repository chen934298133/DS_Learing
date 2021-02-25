package DS.priority;

public class MinTest {
    public static void main(String[] args) {

        MinPriorityQueue<Integer> queue = new MinPriorityQueue<>(10);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);

        System.out.print("MinTest: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.delMin() + " ");
        }
    }
}
