package algorithm.Linear;

import algorithm.Linear.List_OneWay.Node_OneWay;

import java.util.Iterator;


public class Stack_Code<T> implements Iterable{
    private Node_OneWay head;
    private int N;

//    private class Node{
//        public T item;
//        public Node next;
//
//        public Node(T item, Node next) {
//            this.item = item;
//            this.next = next;
//        }
//    }

    private Stack_Code(){
        this.head = new Node_OneWay(null, null);
        this.N = 0;
    }

    public static Stack_Code stack (){
        return new Stack_Code();
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(T t){
        // 找到第一个结点
        Node_OneWay oldFirst = head.next;
        Node_OneWay newNode = new Node_OneWay(t, oldFirst);
        head.next = newNode;
        N++;
    }

    public T pop(){
        Node_OneWay oldFirst = head.next;
        if (oldFirst == null) {
            return null;
        }
        head.next = oldFirst.next;
        N--;
        return (T) oldFirst.getItem();
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterable<>();
    }

    private class SIterable<T> implements Iterator{

        private Node_OneWay n;

        public SIterable(){
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public T next() {
            n = n.next;
            return (T) n.getItem();
        }
    }
}
