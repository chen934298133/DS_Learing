package DS.Sort;

public class Insertion {

    public static void sort(Comparable[] a){
        for(int i = 0 ; i < a.length ; i++){
            for (int j = i ; j > 0 ; j--){
                //比较索引 j 处的值和索引 j-1 处的值，若
                if(greater(a[j-1],a[j])){
                    exch(a,j,j-1);
                }else {
                    break;
                }
            }
        }
    }

    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w) > 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
