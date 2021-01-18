package algorithm.Linear;

public class SequenceList_FirstVersion <T>{

    private T[] eles;
    private int N;

    public SequenceList_FirstVersion(int capacity){
        this.eles =(T[]) new Object[capacity];
        this.N = 0;
    }

    public void clear(){
        this.N = 0;
    }
    public boolean idEmpty(){
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
        for(int index = N-1; index > i; index--){//倒序读取元素,N-1为最后一个元素下标
            eles[index] = eles[index-1];
        }
        eles[i] = t;
    }
    public T remove(int i){
        T temp = eles[i];

        for(int index = i; index < N; index++){
            eles[index] = eles[index+1];
        }

        N--;
        return temp;
    };
    public int indexOf(T t){
        for(int i = 0; i < N; i++){
            if(eles[i].equals(t)) return i;
        }
        return -1;
    };

}
