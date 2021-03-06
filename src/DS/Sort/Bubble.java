package DS.Sort;

public class Bubble {

    public static void sort(Comparable []a){
        for (int i = 0; i < a.length; i++){
            for (int j = i; j < a.length; j++){
                if (a[i].compareTo(a[j]) > 0){
                    exch(a, i, j);
                }
            }
        }
    }

    // 比较v元素是否大于w元素
    private static boolean greater (Comparable a ,Comparable b){
        if(a.compareTo(b) > 0){
            return true;
        }else {
            return false;
        }
    }

    // 数组元素i和j交换位置
    private static void exch(Comparable []arr, int a, int b){
        Comparable temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
