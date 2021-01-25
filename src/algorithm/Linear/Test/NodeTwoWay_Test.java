package algorithm.Linear.Test;

import algorithm.Linear.List_TwoWay.Node_TwoWay;

public class NodeTwoWay_Test {
    public static void main(String[] args){
        Node_TwoWay n1 = new Node_TwoWay(1,null,null) ;
        Node_TwoWay n2 = new Node_TwoWay(2,n1,null) ;
        Node_TwoWay n3 = new Node_TwoWay(3,n2,null) ;
        Node_TwoWay n4 = new Node_TwoWay(4,n3,null) ;
        Node_TwoWay n5 = new Node_TwoWay(4,n4,null) ;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println(n1.next.next.getItem());
        System.out.println(n5.pre.pre.getItem());
    }
}
