package algorithm.Hash_2;

public class Node<Key, Value> {
    private Key key;
    private Value value;
    public Node next;

    public Node(Key key, Value value, Node next){
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
