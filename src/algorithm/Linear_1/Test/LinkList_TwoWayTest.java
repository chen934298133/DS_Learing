package algorithm.Linear_1.Test;

import algorithm.Linear_1.List_TwoWay.LinkList_TwoWay;

public class LinkList_TwoWayTest {
    public static void main(String[] args){
        LinkList_TwoWay l1 = LinkList_TwoWay.l1();
        l1.insert("1");
        l1.insert("2");
        l1.insert("32");
        l1.insert('s');
        l1.insert(2);
        l1.insert(2.1);
        l1.insert(2,"2.5");
        System.out.println(l1.getFirst());
        System.out.print(l1.get(0) + " ");
        System.out.print(l1.get(1) + " ");
        System.out.print(l1.get(2) + " ");
        System.out.println(l1.get(3));
        System.out.println(l1.remove(2));
        System.out.println(l1.getLast());
        System.out.println(l1.indexOf(2));
    }
}
