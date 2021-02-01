package algorithm.Hash_2;

// 有序只需要改put方法
public class OrderHashTable_Code<Key extends Comparable, Value> {
    private Node head;
    private int N;

    private OrderHashTable_Code(){
        this.head = new Node(null, null, null);
        this.N = 0;
    }

    public static OrderHashTable_Code hashTable_code(){
        return new OrderHashTable_Code();
    }

    public int size(){
        return N;
    }

    // 根据键保持顺序，需要再泛型声明时继承comparable,以便调用compareTo()
    public void put(Key key, Value value){
        Node pre = head;
        Node curr = head.next;
        while (curr != null && key.compareTo(curr.getKey()) > 0){
            pre = curr;
            curr = curr.next;
        }

        if (curr != null && key.compareTo(curr.getKey()) == 0){
            curr.setValue(value);
            return;
        }

        Node newNode = new Node(key, value, curr);
        pre.next = newNode;

        N++;
    }

    public void delete(Key key){
        Node temp = head;
        while (temp.next != null){
            if (temp.next.getKey().equals(key)){
                temp.next = temp.next.next;
                N--;
                return;
            }
            temp = temp.next;
        }
    }

    public Value get(Key key){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
            if (temp.getKey().equals(key)){
                return (Value) temp.getValue();
            }
        }
        return null;
    }
}