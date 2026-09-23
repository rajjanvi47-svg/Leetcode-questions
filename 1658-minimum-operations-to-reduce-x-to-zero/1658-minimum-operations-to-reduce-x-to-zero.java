class Solution {
    public int minOperations(int[] nums, int x) {

        int total = 0;

        // Find total sum
        for (int num : nums) {
            total += num;
        }

        int target = total - x;

        // If target is negative, impossible
        if (target < 0) {
            return -1;
        }

        int left = 0;
        int sum = 0;
        int maxLength = -1;

        // Sliding window
        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            // If sum becomes greater than target,
            // move left pointer
            while (sum > target && left <= right) {
                sum -= nums[left];
                left++;
            }

            // Found a subarray with required sum
            if (sum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        // No valid subarray
        if (maxLength == -1) {
            return -1;
        }

        // Elements not kept = operations
        return nums.length - maxLength;
    }
}