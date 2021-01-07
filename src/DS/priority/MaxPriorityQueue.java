package DS.priority;

public class MaxPriorityQueue<T extends Comparable<T>> {

    //
    private T[] items;
    private int N;

    public MaxPriorityQueue(int capacity){
        this.items = (T[]) new Comparable[capacity +1];
        this.N = 0;
    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public boolean less(int i, int j){
        return items[i].compareTo(items[j])<0;
    }

    private void exch(int i, int j){
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public void insert(T t){
        items[++N] = t;
        swim(N);
    }

    public T delMax(){
        T max = items[1];
        exch(1 , N);
        N--;
        sink(1);
        return max;
    }

    private void swim(int k){
        //不断比较当前元素与父元素的大小，若当前元素较大则进入循环
        while (k>1){
            //如果父节点(k/2)比当前节点(k)小,就交换两个值
            if (less(k/2, k)){
                exch(k/2, 2);
            }
            k = k/2;
        }
    }

    //使用下沉算法，使索引k处的元素能在堆中处于一个正确的位置
    private void sink(int k){
        //通过循环不断的对比当前k结点和其左子结点2*k以及右子结点2k+1处中的较大值的元素大小，
        //如果当前结点小，则需要交换位置
        while(2*k <= N){
            //获取当前结点的子结点中的较大结点
            int max;//记录较大结点所在的索引
            if (2*k+1 <= N){//如果存在右子节点
                if (less(2*k,2*k+1)){//左子节点2*k小于右子节点2*k+1
                    max = 2*k+1;
                }else{
                    max = 2*k;
                }
            }else {//若没有右子节点，即只有左子节点
                max = 2*k;
            }

            //比较当前结点和较大结点的值
            if (!less(k,max)){//如果k > max处的元素，结束重新排序
                break;
            }
            //交换k索引处的值和max索引处的值
            exch(k,max);
            //变换k的值，为下次循环做准备
            k = max;

        }


    }
}
