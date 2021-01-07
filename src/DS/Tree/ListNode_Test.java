package DS.Tree;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Iterator;

public class ListNode_Test {
    public static void main(String[] args){
        ListNode listNode0 = new ListNode(0);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode0.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;

//        System.out.println(listNode0.val);
//        System.out.println(listNode0.next.val);

        ListNode tmp = listNode0;
        while (tmp != null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }
        void recur(ListNode head){
            if (head == null) return;

        }
}
