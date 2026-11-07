class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int currSum=0;
        int expSum=n*(n+1)/2;
        for(int i=0;i<nums.length;i++){
currSum += nums[i];
        }
        return expSum-currSum;
    }
}