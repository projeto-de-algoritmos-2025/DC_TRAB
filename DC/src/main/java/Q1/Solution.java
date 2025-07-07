package Q1;

public class Solution {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        return findMaxSubArray(nums, 0, nums.length - 1);
    }

    private static int findMaxSubArray(int[] nums, int left, int right) {

        if (left == right) return nums[left];

        int mid = left + (right - left) / 2;

        int leftSum = findMaxSubArray(nums, left, mid);
        int rightSum = findMaxSubArray(nums, mid + 1, right);

        int crossSum = findMaxCrossingSubArray(nums, left, mid, right);

        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }

    private static int findMaxCrossingSubArray(int[] nums, int left, int mid, int right) {
        int leftSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = mid; i >= left; i--) {
            currentSum += nums[i];
            if (currentSum > leftSum) leftSum = currentSum;
        }

        int rightSum = Integer.MIN_VALUE;
        currentSum = 0;
        for (int i = mid + 1; i <= right; i++) {
            currentSum += nums[i];
            if (currentSum > rightSum) rightSum = currentSum;
        }
        return leftSum + rightSum;
    }
}