package DS.priority;

public class MaxTest {
    public static void main(String[] args) {

        MaxPriorityQueue<Integer> queue = new MaxPriorityQueue<>(10);

        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);

        System.out.print("MaxTest: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.delMax() + " ");
        }
    }
}
