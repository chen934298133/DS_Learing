package LeetCode_2021.Coding_2021_06_11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = map.keySet();

        System.out.println(set.contains("1"));
        System.out.println(map.entrySet());
        System.out.println(Math.max(100, 10));
        int[] a = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        int[] b = {1};
//        System.out.println(majorityElement(a));
        System.out.println(majorityElement(b));
        System.out.println(majorityElement2(b));
    }

    public static int majorityElement(int[] nums) {

        int temp = 0;
        int index = nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Set<Integer> set = map.keySet();
            if (set.contains(num)) {
                map.put(num, map.get(num) + 1);
                if (temp != Math.max(temp, map.get(num))) {
                    temp = Math.max(temp, map.get(num));
                    index = num;
                }
            } else {
                map.put(num, 1);
            }
        }
        return index;
    }

    public static int majorityElement2(int[] nums) {
        int[] arr = new int[nums.length];
        for (int num : nums) {
            arr[num] = arr[num]+1;
        }
        System.out.println(arr.toString());
        return -1;
    }
}
