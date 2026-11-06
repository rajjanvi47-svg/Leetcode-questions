class Solution {
    public int[] productExceptSelf(int[] nums) {

        int result[] = new int[nums.length];

        // Calculate left multiplication
        int prefix = 1;

        for(int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = prefix * nums[i];
        }

        // Calculate right multiplication
        int sufix = 1;

        for(int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * sufix;
            sufix = sufix * nums[i];
        }

        return result;
    }
}