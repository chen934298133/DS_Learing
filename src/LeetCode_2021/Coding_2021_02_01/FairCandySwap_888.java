package LeetCode_2021.Coding_2021_02_01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandySwap_888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        // 公式: x = y + (SumA - SumB) / 2
        // 求和
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();

        int delta = (sumA - sumB) / 2;
        // 将A元素存入哈希表
        Set<Integer> rec = new HashSet<Integer>();
        for (int num : A) {
            rec.add(num);
        }
        // 在遍历B序列是查询是否有对应的A‘存在，若存在则退出
        int[] ans = new int[2];
        for (int y : B) {
            int x = y + delta;
            if (rec.contains(x)) {
                ans[0] = x;
                ans[1] = y;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(Arrays.stream(arr).sum());
    }
}