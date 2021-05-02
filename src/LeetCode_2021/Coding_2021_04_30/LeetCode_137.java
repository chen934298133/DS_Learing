package LeetCode_2021.Coding_2021_04_30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LeetCode_137 {


    public int singleNumber(int[] nums) {
        int value = 1;
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, 3);
                continue;
            } else {
                map.put(num, 1);
            }
        }
        int result = -1;
        // 通过 value 获取 key
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (value == entry.getValue()) {
                result = entry.getKey();
            }
        }
        return result;
    }

    public int singleNumber2(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int occ = entry.getValue();
            if (occ == 1) {
                ans =  entry.getKey();
                break;
            }
        }
        return ans;
    }


    public int singleNumber3(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; ++i) {
            int total = 0;
            for (int num: nums) {
                total += ((num >> i) & 1);
            }
            if (total % 3 != 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        LeetCode_137 l = new LeetCode_137();
        int[] nums = {2, 2, 3, 2, 1, 1, 1};
        System.out.println(l.singleNumber3(nums));
    }
}
