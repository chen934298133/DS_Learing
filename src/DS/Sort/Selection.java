package DS.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Selection {
    /**
     * 对数组内的元素进行排序
     * sort(Comparable[] a)
     *
     * 判断v是否大于w
     * greater(Comparable v, Comparable w)
     *
     * 交换a数组中，索引i和索引j处的值
     * exch(Comparable [] a,int i, int j)
     */

    public static void main(String[] args){
        Integer sum[] = {2,1,3,6,4,9,0,8};
//        Selection s1 = new Selection();
        System.out.println(Arrays.toString(sum));
        sort(sum);
        System.out.println(Arrays.toString(sum));
    }

    public static void sort (Comparable [] a){
        for(int i=0 ;i<a.length-1 ;i++){
            int minIndex = i;
            for (int j=i+1;j<a.length;j++){
                if(greater(a[minIndex],a[j])){
                    minIndex=j;
                }
            }
            exch(a,i,minIndex);
        }

    }

    public static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w) > 0;
    }

    //元素i和j交换位置
    public static void exch(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
