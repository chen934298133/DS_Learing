package LeetCode_2021.Coding_2021_02_11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class KthLargestElementInAStream_703 {

    HashSet<Integer> list = new HashSet<>();
    private int temp;

    public void KthLargest(int k, int[] nums) {
        for (int i : nums) {
            list.add(i);
        }
        temp = k;
    }

    public int add(int val) {
        list.add(val);
        System.out.println(list.clone());
        Iterator iterator = list.iterator();
        for (int i = 0; i < temp; i++) {
             = iterator.next();
        }
        return list.size();
    }
}
