package DS.List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Test {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList();
        list.add(2);
        list.addFirst(1);
        list.addLast(3);
        list.add(4);
        System.out.println(list.toString());
//        System.out.println(list.indexOf(1));
        System.out.println(list.peek());
        System.out.println(list.poll());
//        System.out.println(list.pollLast());
        System.out.println(list.pop());
//        System.out.println(list.contains(2));
        System.out.println(list.clone());
        System.out.println(list.hashCode());
        System.out.println(list.offer(10));
        System.out.println(list.element());     // gitFirst()
        System.out.println(Arrays.toString(list.toArray()));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        System.out.println(list.spliterator());
    }
}
