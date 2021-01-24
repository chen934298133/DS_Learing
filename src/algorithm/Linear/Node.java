package algorithm.Linear;

public class Node<T>{
    private T item;
    public Node next;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node(T item, Node next){
        this.next = next;
        this.item = item;
    }
}
