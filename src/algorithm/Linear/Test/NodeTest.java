package algorithm.Linear.Test;

import algorithm.Linear.Node;

public class NodeTest {
    public static void main(String[] args){
        Node<Integer> n1 = new Node<Integer>(1,null);
        Node<Integer> n2 = new Node<>(2,null);
        Node<Integer> n3 = new Node<>(3,null);
        Node<Integer> n4 = new Node<>(4,null);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.setItem(11);
        System.out.println(n3.next.getItem());
    }
}
