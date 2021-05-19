package LeetCode_2021.Coding_2021_05_14;

public class maxSubArrayTest {
    public int maxSubArray(int[] nums) {
        int sum = 0, ans = 0, last = 0;
        for (int num : nums) {

            // 1. 若当前 num > 0 且 sum > 0 但上一个num< 0 ，更新sum为当前num
            if (sum > 0 && num > 0 ) {
                sum = num;
            }

            sum += num;

            // 2. 若当前 num < 0 且 sum < 0 , 则更新sum为当前 num
            if (sum <= 0) {
                sum = num;
            }
            ans = Math.max(ans, sum);
            last = sum;
        }
        return ans;
    }

    public int maxSubArray1(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        maxSubArrayTest test = new maxSubArrayTest();
        int[] nums = {-2, 1, -3, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(test.maxSubArray(nums));
        System.out.println(test.maxSubArray1(nums));
    }
}
