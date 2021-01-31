package LeetCode_2021.Coding_2021_01_31;

public class Offer25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dum = new ListNode(0);
        ListNode cur = dum;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = (l1 == null ? l2 : l1);
        return dum.next;
    }

    public ListNode mergeTwoLists_Recursive(ListNode l1, ListNode l2) {
        //递归实现
        return recur(l1, l2);
    }

    public ListNode recur(ListNode l1, ListNode l2) {
        //是否为null判断
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        //新建头结点
        ListNode head = null;

        //如果l1.val <= l2.val，那么头结点的值为l1.head的值，然后开始递归
        if (l1.val <= l2.val) {
            head = new ListNode(l1.val);
            head.next = recur(l1.next, l2);
        }
        //否则，头结点的值为l2.head的值，然后开始递归
        else {
            head = new ListNode(l2.val);
            head.next = recur(l1, l2.next);
        }

        //返回该链表
        return head;
    }
}
