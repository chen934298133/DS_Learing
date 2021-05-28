package LeetCode_2021.Coding_2021_05_28;

public class Offer22 {

    // 单指针遍历两次
    public ListNode getKthFromEnd(ListNode head, int k) {
        // 1. 若只有一个节点直接返回
        if (head.next == null && k == 1) {
            return head;
        }
        // 设置参照值
        int index = 1;
        ListNode tempNode = head;
        // 2. 查看链表长度
        while (tempNode.next != null) {
            tempNode = tempNode.next;
            index++;
        }
        // 3. 获取链表正向index
        int temp = index - k + 1;
        // 4. 遍历至index,并返回
        index = 1;
        while (head.next != null) {
            if (index == temp) {
                return head;
            }
            head = head.next;
            index++;
        }
        return head;
    }

    // 双指针遍历一次
    public ListNode getKthFromEnd2(ListNode head, int k) {
        // 定义快慢指针
        ListNode slow = head, fast = head;
        //  1. 设置一个变量判断，将快指针先行与两个指针共行放在同一个循环内
        int t = 0;
        while (fast != null) {
            // 2. 当快指针先行完成后慢指针开始移动，当快指针移动到最后时慢指针所指即为倒数第k个节点
            if (t >= k) {
                slow = slow.next;
            }
            fast = fast.next;
            t++;
        }
        return slow;
    }

    // 双指针遍历两次
    public ListNode getKthFromEnd3(ListNode head, int k) {
        // 定义快慢指针
        ListNode fast = head, slow = head;
        // 1. 快指针先走 k 步
        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }
        // 2. 快指针走到头，慢指针即为倒数第k个值
        while (slow != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
//        ListNode l3 = new ListNode(3);
//        ListNode l4 = new ListNode(4);
        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
        Offer22 offer22 = new Offer22();
        System.out.println(offer22.getKthFromEnd(l1, 2).val);
//        ListNode temp = l1;
//        l1 = l1.next;
//        System.out.println(temp.val);
//        System.out.println(l1.val);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}