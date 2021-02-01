package algorithm.Hash_2;

import java.util.Iterator;

public class HashTable_Code<Key, Value> implements Iterable<Key>{
    private Node head;
    private int N;

    private HashTable_Code(){
        this.head = new Node(null, null, null);
        this.N = 0;
    }

    public static HashTable_Code hashTable_code(){
        return new HashTable_Code();
    }

    public int size(){
        return N;
    }

    public void put(Key key, Value value){
        Node temp = head;
        while( temp.next != null){
            temp = temp.next;
            if(temp.getKey().equals(key)){
                temp.setValue(value);
            }
        }
        Node newFirst = new Node(key, value,null);
        Node oldFirst = head.next;
        newFirst.next = oldFirst;
        head.next = newFirst;
        N++;
    }

    public void delete(Key key){
        // 此处耗费半小时理解了起始处head与head.next不同写法
        Node cur = head;
//        Node temp = head.next;
        while (cur.next != null){
            if (cur.next.getKey().equals(key)){
                cur.next = cur.next.next;
                N--;
                return;
            }
//            temp = temp.next;
            cur = cur.next;
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

    @Override
    public Iterator<Key> iterator() {
        return new HIterator();
    }

    private class HIterator implements Iterator{

        private Node curr;
        public HIterator(){
            this.curr = head;
        }
        @Override
        public boolean hasNext() {
            return curr.next != null;
        }

        @Override
        public Key next() {
            curr = curr.next;
            return (Key) curr.getKey();
        }
    }
}
