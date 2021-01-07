package LeetCode_2020.Stack;

import DS.Tree.ListNode;

import java.util.Arrays;
import java.util.LinkedList;

public class Offer06_Stack {
    public static void main(String[] args){
        Offer06_Stack s = new Offer06_Stack();

        ListNode listNode0 = new ListNode(0);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        System.out.println(Arrays.toString(s.reversePrint(listNode0)));
    }

    public int[] reversePrint(ListNode head){
        LinkedList<Integer> stack = new LinkedList<>();
        while (head != null){
            stack.addLast(head.val);
            head = head.next;
        }
        int [] res = new int[stack.size()];
//        for (int i = 0; i < res.length; i++) {
//            res[i] = stack.pollLast();
//        }

        int i = 0;
        for (int tmp : stack) {
            res[i++] = tmp;
        }
    return res;
    }
}
