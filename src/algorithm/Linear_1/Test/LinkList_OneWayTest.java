package algorithm.Linear_1.Test;

import algorithm.Linear_1.List_OneWay.LinkList_OneWay;

public class LinkList_OneWayTest {
    public static void main(String[] args){
        LinkList_OneWay l1 = LinkList_OneWay.linkListA();
        l1.insert("1");
        l1.insert("2");
        l1.insert("3");
        System.out.println(l1.get(0));
        System.out.println(l1.indexOf(1));
    }
}
