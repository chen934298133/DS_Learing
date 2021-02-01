package algorithm.Linear_1.List_TwoWay;



public class LinkList_TwoWay<T> {
    private Node_TwoWay head;
    private Node_TwoWay last;
    private int N;

    private LinkList_TwoWay() {
        this.head = new Node_TwoWay(null, null, null);
        this.last = null;
        this.N = 0;
    }
    // 使用静态工厂构造
    public static LinkList_TwoWay l1(){
        return new LinkList_TwoWay();
    }

    public void clear(){
        this.head.next = null;
        this.head.pre = null;
        this.head.setItem(null);
        this.last = null;
        this.N = 0;
    }

    public int length(){
        return N;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void insert(T t){
        if (isEmpty()){
            Node_TwoWay newNode = new Node_TwoWay(t, head,null);

            head.next = newNode;
            last = newNode;
        }else {
            Node_TwoWay oldLast = last;
            Node_TwoWay newNode = new Node_TwoWay(t, oldLast,null);

            oldLast.next = newNode;
            last = newNode;
        }
        N++;
    }

    public void insert(int index, T t){
        Node_TwoWay pre = head;
        for (int i = 0; i < index; i++){
            pre= pre.next;
        }
        Node_TwoWay curr = pre.next;
        Node_TwoWay newCode= new Node_TwoWay(t, pre, curr);
        pre.next = newCode;
        curr.pre = newCode;
        N++;
    }

    public T get(int index){
        Node_TwoWay pre = head;
        for (int i = 0; i < index; i++){
            pre = pre.next;
        }
        return (T) pre.next.getItem();
    }

    public T remove(int index){
        Node_TwoWay pre = head;
        // find pre
        for (int i = 0; i < index; i++){
            pre = pre.next;
        }
        // find curr
        Node_TwoWay curr = pre.next;
        // find curr.next
        Node_TwoWay currNext = curr.next;

        /* remove curr*/
        // set pre.next = curr.next
        pre.next = currNext;
        // set curr.next.pre = pre
        currNext.pre = pre;

        N--;
        return (T) curr.getItem();
    }

    public T getFirst(){
        if (isEmpty()){
            return null;
        }
        return (T) head.next.getItem();
    }
    public T getLast(){
        if (isEmpty()){
            return null;
        }
        return (T) last.getItem();
    }
    
    public int indexOf(T t){
        Node_TwoWay pre = head;
        for (int i = 0; i < length(); i++){
            pre = pre.next;
            if (pre.getItem().equals(t)){
                return i;
            }
        }
        return -1;
    }


}
