package algorithm.Linear.List_OneWay;

import java.util.Iterator;

public class LinkList_OneWay<T> implements Iterable{

    private Node_OneWay head;
    private int N;

    private LinkList_OneWay(){
        this.head = new Node_OneWay(null,null);
        this.N = 0;
    }

    // 使用静态工厂构造函数
    public static LinkList_OneWay linkListA(){
        return new LinkList_OneWay();
    }

//    private class Node{
//        T item;
//        Node next;
//        public Node(T item, Node next){
//            this.item = item;
//            this.next = next;
//        }
//    }

    public void clear(){
        head.next = null;
        N = 0;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int length(){
        return N;
    }

    public T get(int index){
        Node_OneWay n = head.next;
        for( int i = 0; i < index; i++){
            n = n.next;
        }
        return (T) n.getItem();
    }

    public void insert(T t){
        Node_OneWay n = head;
        while(n.next != null){
            n = n.next;
        }
        Node_OneWay temp = new Node_OneWay(t,null);
        n.next = temp;
        N++;
    }

    public void insert(int index, T t){
        Node_OneWay pre = head;
        for(int i = 0; i < index-1; i++){
            pre = pre.next;
        }
        Node_OneWay curr = pre.next;

        Node_OneWay temp = new Node_OneWay(t,curr);
        pre.next = temp;
        N++;

    }

    public T remove(int index){
        Node_OneWay pre = head;
        for(int i = 0; i < index-1; i++){
            pre = pre.next;
        }
        Node_OneWay curr = pre.next;
        Node_OneWay temp = curr.next;
        pre.next = temp;
        N--;
        return (T) curr.getItem();
    }

    public int indexOf(T t){
        Node_OneWay n = head;
        for (int i = 0; n.next != null; i++){
            n = n.next;
            if(n.getItem().equals(t)){
                return i;
            }
        }
        return -1;
    }

    @Override
    // 需要返回Iterator对象，但由于Iterator是接口，需要构造一个内部类
    public Iterator<T> iterator() {
        // 类似静态工厂
        return new LIterator();
    }

    // 此内部类需要实现遍历方法
    private class LIterator implements Iterator{

        private Node_OneWay n;
        public LIterator(){
            this.n = head;
        }
        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.getItem();
        }
    }
}
