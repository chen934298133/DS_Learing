package LeetCode_2021.Coding_2021_06_10;

import java.util.Arrays;

public class minNumber {

    public static void main(String[] args) {

    }

    public String minNumber(int[] nums) {
        // 1. 将 int 数组转为 string 数组
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        // 2. 快排将字符数组排序为目标顺序
        quickSort(strs, 0, strs.length - 1);

        // 3. 拼接字符串
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s);
        }
        return res.toString();
    }

    // 快速排序
    void quickSort(String[] strs, int l, int r) {
        // 快排结束标识
        if (l >= r) return;

        //
        int i = l, j = r;
        String tmp = strs[i];
        while (i < j) {
            while ((strs[j] + strs[l]).compareTo(strs[l] + strs[j]) >= 0 && i < j) j--;
            while ((strs[i] + strs[l]).compareTo(strs[l] + strs[i]) <= 0 && i < j) i++;
            tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;
        }
        strs[i] = strs[l];
        strs[l] = tmp;
        quickSort(strs, l, i - 1);
        quickSort(strs, i + 1, r);
    }

    public String minNumber2(int[] nums) {
        // 1. 转为 String 数组
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }

        // 2. 内置函数排序
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));

        // 3. 拼接字符
        StringBuilder res = new StringBuilder();
        for (String s : strs){
            res.append(s);
        }
        return res.toString();
    }


    public String minNumber3(int[] nums) {
        // 1. 转为 String 数组
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        // 2. 进入快排
        quickSort3(strs, 0, strs.length - 1);

        // 3. 拼接字符
        StringBuilder res = new StringBuilder();
        for (String s : strs){
            res.append(s);
        }
        return res.toString();
    }

    // 快排
    public void quickSort3(String[] strs, int low, int high) {
        if (low < high) {
            int middle = getMiddle(strs, low, high);
            quickSort3(strs, low, middle - 1);
            quickSort3(strs, middle + 1, high);
        }
    }

    // 找到中位数
    public int getMiddle(String[] strs, int low, int high) {
        //数组的第一个数为基准元素
        String temp = strs[low];
        while (low < high) {
            //从后向前找比基准小的数
            while (low < high && (strs[high] + temp).compareTo(temp + strs[high]) >= 0){
                high--;
            }
            //把比基准小的数移到低端
            strs[low] = strs[high];

            //从前向后找比基准大的数
            while (low < high && (strs[low] + temp).compareTo(temp + strs[low]) <= 0){
                low++;
            }
            //把比基准大的数移到高端
            strs[high] = strs[low];
        }
        strs[low] = temp;
        return low;
    }

}
