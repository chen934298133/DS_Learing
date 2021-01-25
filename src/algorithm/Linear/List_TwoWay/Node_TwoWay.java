package algorithm.Linear.List_TwoWay;

public class Node_TwoWay<T> {
    private T item;
    public Node_TwoWay pre;
    public Node_TwoWay next;

    public Node_TwoWay(T item, Node_TwoWay pre, Node_TwoWay next){
        this.item = item;
        this.pre = pre;
        this.next = next;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
