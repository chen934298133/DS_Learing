package LeetCode_2021.Coding_2021_01_17;

public class Offer11_DichotomicMethod {
    public int minArray(int[] nums){
        int i = 0, j = nums.length-1;
        while(i < j){
            int m = (i + j) / 2;
            if (nums[m] > nums[j]){
                i = m + 1;
            } else if (nums[m] < nums[j]) {
                j = m;
            } else {
                j--;
            }
        }
        return nums[i];
    }
    public static void main(String[] args){
        int[] nums = {4,5,6,1,2,3};
        Offer11_DichotomicMethod o1 = new Offer11_DichotomicMethod();
        System.out.println(o1.minArray(nums));
    }
}
