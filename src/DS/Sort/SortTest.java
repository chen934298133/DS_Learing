package DS.Sort;

import java.util.Arrays;
import java.util.LinkedList;

public class SortTest {
    public static void main(String[] args){

        Integer [] sum = {9,3,8,7,6,5,4,2,1,0};
        System.out.println(Arrays.toString(sum));
//        Selection.sort(sum);
//        Insertion.sort(sum);
        Bubble.sort(sum);
        System.out.println(Arrays.toString(sum));
    }
}
