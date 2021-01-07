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
        arrayList.add(5);
        for (int i :arrayList ) {
            System.out.println(i);
        }
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
