package algorithm.Linear.Test;

import algorithm.Linear.List_OneWay.Node_OneWay;

public class NodeTest {
    public static void main(String[] args){
        Node_OneWay<Integer> n1 = new Node_OneWay<>(1,null);
        Node_OneWay<Integer> n2 = new Node_OneWay<>(2,null);
        Node_OneWay<Integer> n3 = new Node_OneWay<>(3,null);
        Node_OneWay<Integer> n4 = new Node_OneWay<>(4,null);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.setItem(11);
        System.out.println(n3.next.getItem());
    }
}
