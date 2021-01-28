package LeetCode_2021.Coding_2021_01_28;

public class Offer21 {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        while( left < right){
            while (left < right && (nums[left] & 1) == 1){
                left++;
            }
            while (left < right && (nums[right] & 1) == 0){
                right--;
            }
            swap(nums, left, right);
        }
        return nums;
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
