package algorithm.Linear.List_OneWay;

public class Node_OneWay<T>{
    private T item;
    public Node_OneWay next;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node_OneWay(T item, Node_OneWay next){
        this.next = next;
        this.item = item;
    }
}
