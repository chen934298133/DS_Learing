package LeetCode_2021.Coding_2021_06_08;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueueTemp {
    Queue<Integer> q;//q作为辅助队列，按正常顺序放入元素
    Deque<Integer> d;//d作为双端队列，始终维持一个递减的队列，这样队列头就是最大值

    public MaxQueueTemp() {
        q = new LinkedList<Integer>();
        d = new LinkedList<Integer>();
    }

    public int max_value() {
        if (q.isEmpty() || d.isEmpty()) {
            return -1;
        }
        return d.getFirst();
    }

    public void push_back(int value) {
        while (!d.isEmpty() && value > d.getLast()) {
            d.pollLast();
        }
        q.offer(value);
//        d.push(value);
        d.offerLast(value);
//        d.add(value);
    }

    public int pop_front() {
        if (q.isEmpty()){
            return -1;
        }
        if (max_value() == q.peek()){
            d.pollFirst();
        }
        return q.poll();
    }
}