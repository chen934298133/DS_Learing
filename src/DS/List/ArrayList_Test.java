package DS.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Test {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println(arrayList.contains(1));          // t
        System.out.println(arrayList.get(0));               // 1
        System.out.println(arrayList.indexOf(1));           // 0
        System.out.println(arrayList.lastIndexOf(1));    // 0
        System.out.println(arrayList.clone());              // [1, 2, 3, 4]
        System.out.println(arrayList.toString());           // [1, 2, 3, 4]
        System.out.println(arrayList.toArray());            // [Ljava.lang.Object;@4554617c
        System.out.println(arrayList.remove(3));      // 4
        System.out.println(arrayList.size());               // 3
        System.out.println(arrayList.isEmpty());            // false
        System.out.println(arrayList.set(0,9));            // 1(替换1为9，返回原来的元素值)

        for (int i :arrayList ) {
            System.out.print(i);                            // 923
        }
        System.out.println();

        Iterator<Integer> iterator = arrayList.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next());              // 923
        }

    }
}
