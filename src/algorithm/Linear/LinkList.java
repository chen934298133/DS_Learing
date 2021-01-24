package algorithm.Linear;

public class LinkList<T> {

    private Node head;
    private int N;

    private  LinkList(){
        this.head = new Node(null,null);
        this.N = 0;
    }

    public static LinkList linkListA(){
        return new LinkList();
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
        Node n = head.next;
        for( int i = 0; i < index; i++){
            n = n.next;
        }
        return (T) n.getItem();
    }

    public void insert(T t){
        Node n = head;
        while(n.next != null){
            n = n.next;
        }
        Node temp = new Node(t,null);
        n.next = temp;
        N++;
    }

    public void insert(int index, T t){
        Node pre = head;
        for(int i = 0; i < index-1; i++){
            pre = pre.next;
        }
        Node curr = pre.next;

        Node temp = new Node(t,curr);
        pre.next = temp;
        N++;

    }

    public T remove(int index){
        Node pre = head;
        for(int i = 0; i < index-1; i++){
            pre = pre.next;
        }
        Node curr = pre.next;
        Node temp = curr.next;
        pre.next = temp;
        N--;
        return (T) curr.getItem();
    }

    public int indexOf(T t){
        Node n = head;
        for (int i = 0; n.next != null; i++){
            n = n.next;
            if(n.getItem().equals(t)){
                return i;
            }
        }
        return -1;
    }
}
