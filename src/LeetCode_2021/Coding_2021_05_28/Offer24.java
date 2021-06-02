package LeetCode_2021.Coding_2021_05_28;

public class Offer24 {

    // 双指针
    public ListNode reverseList(ListNode head) {
        // 1. 定义双指针，一快一慢
        ListNode cur = null, pre = head;
        // 2. 模拟pre、cur前进
        while (pre != null) {
            // a. 获取pre的下一个节点，为pre的移动做准备
            ListNode temp = pre.next;
            // b. 局部反转，pre.next 指向 当前 cur
            pre.next = cur;
            // c. cur前进一个节点
            cur = pre;
            // d. pre前进一个节点
            pre = temp;
        }
        return cur;
    }

    // 递归
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 递归至最后一个节点，开始给返回链表设值
        ListNode ret = reverseList1(head.next);
        // head节点的下一个节点指向head
        head.next.next = head;
        // head节点指向null
        head.next = null;
        // 完成局部反转
        return ret;
    }


    public ListNode reverseList2(ListNode head) {
        // 原链表的头结点就是反转之后链表的尾结点，使用 head 标记 .
        if (head == null) { return null; }
        // 定义指针 cur，初始化为 head .
        ListNode cur = head;
        while (head.next != null) {
            ListNode t = head.next.next;
            // 每次都让 head 下一个结点的 next 指向 cur ，实现一次局部反转
            head.next.next = cur;
            // 局部反转完成之后，cur 和 head 的 next 指针同时 往前移动一个位置
            cur = head.next;
            head.next = t;
        }
        // 循环上述过程，直至 cur 到达链表的最后一个结点 .
        return cur;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
//        l3.next = l4;
        Offer24 offer24 = new Offer24();
        System.out.println(offer24.reverseList1(l1).val);
    }
}
