package LeetCode_2021.Coding_2021_05_28;

public class Offer24 {

    // 双指针
    public ListNode reverseList(ListNode head) {
        // 1. 定义双指针，一快一慢
        ListNode cur = null, pre = head;
        while(pre != null){
            // tiqu
            ListNode temp = pre.next;
            //
            pre.next = cur;
            //
            cur = pre;
            //
            pre = temp;
        }
        return cur;
    }

    // 递归
    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        // 递归值最后一个节点，开始给返回链表设值
        ListNode ret = reverseList1(head.next);
        // head节点的下一个节点指向head
        head.next.next = head;
        // head节点指向null。完成局部反转
        head.next = null;
        return ret;
    }


    public ListNode reverseList2(ListNode head) {
        if (head == null) { return null; }
        ListNode cur = head;
        // 交替变换指针
        while (head.next != null) {
            ListNode t = head.next.next;
            head.next.next = cur;
            cur = head.next;
            head.next = t;
        }
        return cur;
    }

    public static void main(String[] args){
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
