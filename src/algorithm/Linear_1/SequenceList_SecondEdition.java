package algorithm.Linear_1;

import java.util.Iterator;

public class SequenceList_SecondEdition<T> implements Iterable{
    private int N;
    private T[] eles;

    private SequenceList_SecondEdition(int capacity){
        this.eles = (T[]) new Object[capacity];
        this.N = 0;
    }

    public static SequenceList_SecondEdition sequenceList_secondEdition(int capacity){
        return new SequenceList_SecondEdition(capacity);
    }

    public void clear(){
        this.N = 0;
    }

    public boolean isEmpty(){
        return this.N == 0;
    }

    public int length(){
        return N;
    }

    public T get(int i){
        return eles[i];
    }

    public void insert(T t){
    // ====================================================================================
        if (N == eles.length){
            resize(N * 2);
        }
        eles[N++] = t;
    }

    public void insert(int index, T t){
    // ====================================================================================
        if (N == eles.length){
            resize(N * 2);
        }
        for (int i = N; i > index; i--){
            eles[i] = eles[i-1];
        }

        eles[index] = t;
        N++;
    }
    public T remove(int index){
        T temp = eles[index];
        for (int i = index; i < N; i++){
            eles[i] = eles[i+1];
        }
        N--;
    // ====================================================================================

        if (N < (eles.length / 4)){
            resize(eles.length / 2);
        }
        return temp;
    }
    // ====================================================================================
    public void resize(int newSize){
        // temp array
        T[] temp = eles;
        // new array
        eles = (T[]) new Object[newSize];
        // copy elements to new array
        for (int i = 0; i < N; i++) {
            eles[i] = temp[i];
        }
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    private class SIterator implements Iterator{

        private int temp;
        private SIterator(){
            this.temp = 0;
        }
        @Override
        public boolean hasNext() {
            return this.temp < N;
        }

        @Override
        public Object next() {
            return eles[temp++];
        }
    }
}
