package algorithm.Linear;

import java.util.Iterator;

public class SequenceList_FirstEdition<T> implements Iterable{

    private T[] eles;
    private int N;

//    //使用构造函数构造
//    public SequenceList_FirstVersion(int capacity){
//        this.eles =(T[]) new Object[capacity];
//        this.N = 0;
//    }

    // 使用静态工厂，此处重点在于peivate
    private SequenceList_FirstEdition(int capacity){
        this.eles =(T[]) new Object[capacity];
        this.N = 0;
    }

    // 使用静态工厂构造，此处重点在于static
    public static SequenceList_FirstEdition sequenceList_firstVersion1(int capacity){
        return new SequenceList_FirstEdition(capacity);
    }

    public void clear(){
        this.N = 0;
    }
    public boolean isEmpty(){
        return N == 0;
    }
    public int length(){
        return N;
    }
    public T get(int i){
        return eles[i];
    }
    public void insert(T t){
        eles[N++] = t;
    }
    public void insert(int i, T t){//i为下标，不是顺序个数
        for(int index = N; index > i; index--){//倒序读取元素,N-1为最后一个元素下标
            eles[index] = eles[index-1];
        }
        eles[i] = t;
        N++;
    }
    public T remove(int i){
        T temp = eles[i];

        for(int index = i; index < N; index++){
            eles[index] = eles[index+1];
        }

        N--;
        return temp;
    }

    public int indexOf(T t){
        for(int i = 0; i < N; i++){
            if(eles[i].equals(t)) return i;
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{

        private int temp;
        public SIterator(){
            this.temp = 0;
        }

        @Override
        public boolean hasNext() {
            return temp<N;
        }

        @Override
        public Object next() {
            return eles[temp++];
        }
    }

}
