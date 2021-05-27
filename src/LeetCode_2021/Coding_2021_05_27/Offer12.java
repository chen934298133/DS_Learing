package LeetCode_2021.Coding_2021_05_27;

public class Offer12 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode result = head;
        // 1.若第一个节点的val就等于val，直接返回
        if (head.val == val) {
            return head.next;
        }
        // 2.若此节点后面有节点且后面的节点的val！=val就向后移位
        while (head.next != null && head.next.val != val) {
            head = head.next;
        }
        // 定位到要删除节点是下一个节点
        // 3.删除节点
        if (head.next != null) {
            head.next = head.next.next;
        }
        return result;
    }

    // 双指针
    public ListNode deleteNode2(ListNode head, int val) {
        //  若第一个节点的val就等于val，直接返回
        if (head.val == val) return head.next;
        //  定义双指针
        ListNode pre = head, cur = head.next;
        // 1. 若下一个节点不为空，且下一个结点的val != val 就进入遍历
        while (cur != null && cur.val != val) {
            // 更新节点位置
            pre = cur;
            cur = cur.next;
        }
        // 2. 定位到要删除节点是下一个节点
        // 删除节点
        if (cur != null) pre.next = cur.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-3);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(-99);
//        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
//        l3.next = l4;
        Offer12 offer12 = new Offer12();
        System.out.println(l3.next);
        offer12.deleteNode2(l1, -99);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}