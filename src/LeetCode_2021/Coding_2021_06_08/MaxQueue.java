package LeetCode_2021.Coding_2021_06_08;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class MaxQueue {
    Queue<Integer> q;//q作为辅助队列，按正常顺序放入元素
    Deque<Integer> d;//d作为双端队列，始终维持一个递减的队列，这样队列头就是最大值

    public MaxQueue() {
        q = new LinkedList<Integer>();
        d = new LinkedList<Integer>();
    }

    public int max_value() {
        if (d.isEmpty()) {
            return -1;
        }
        return d.peekFirst();
    }

    public void push_back(int value) {
        while (!d.isEmpty() && d.peekLast() < value) {
            d.pollLast();
        }
        d.offerLast(value);
        q.offer(value);
    }

    public int pop_front() {
        if (q.isEmpty()) {
            return -1;
        }
        int ans = q.poll();
        if (ans == d.peekFirst()) {//注意如果d中pop_front的值和q中最大值一样的话，因为要pop所以q中的最大值就要弹出来
            d.pollFirst();
        }
        return ans;
    }
}