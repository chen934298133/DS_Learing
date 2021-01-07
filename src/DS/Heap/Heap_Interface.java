package DS.Heap;

public class Heap_Interface<T extends Comparable<T>>{

    //存储堆中的元素
    T[] items;
    //记录堆中元素的个数
    int N ;


    //判断堆中索引i处的元素是否小于索引j处的元素
    boolean less(int i, int j) {
        return false;
    }

    //交换堆中i索引和j索引处的值
    void exch(int i, int j) {

    }

    //往堆中插入一个元素
    void insert(T t) {

    }

    //使用上浮算法，使索引k处的元素能在堆中处于一个正确的位置
    void swim(int k) {

    }

    //删除堆中最大的元素,并返回这个最大元素
    T delMax() {
        return null;
    }

    //使用下沉算法，使索引k处的元素能在堆中处于一个正确的位置
    void sink(int k) {

    }
}
