package algorithm.Linear;

import algorithm.Linear.List_OneWay.Node_OneWay;

import javax.xml.soap.Node;
import java.util.Iterator;

public class Queue_Code<T> implements Iterable<T>{
    private Node_OneWay head;
    private Node_OneWay last;
    private  int N;

    private Queue_Code(){
        this.head = new Node_OneWay(null,null);
        this.last = null;
        this.N = 0;
    }

    public static Queue_Code queue(){
        return new Queue_Code();
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void add(T t){
        if (last == null) {
            last = new Node_OneWay(t,null);
            head.next = last;
        }else {
            Node_OneWay newLast = new Node_OneWay(t, null);
            last.next = newLast;// 将原队尾结点与新队尾结点连接
            last = newLast; // 更新尾结点

//            Node_OneWay oldLast = last;             // 获取原队尾结点
//            last = new Node_OneWay(t, null);   // 更新尾结点
//            oldLast.next=last;                      // 将原队尾结点与新队尾结点连接
        }
        N++;
    }

    public T poll(){
        if (isEmpty()){
            return null;
        }
        Node_OneWay oldFirst = head.next;
        head.next = oldFirst.next;
        N--;

        if (isEmpty()){
            last = null;
        }

        return (T) oldFirst.getItem();
    }

    @Override
    public Iterator<T> iterator() {
        return new QIterator();
    }

    private class QIterator implements Iterator{

        private Node_OneWay n;

        public QIterator(){
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
