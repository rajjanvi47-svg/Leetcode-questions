class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        int[] freq = new int[nums.length + 1];

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        // Find missing numbers
        for (int i = 1; i <= nums.length; i++) {

            if (freq[i] == 0) {
                result.add(i);
            }
        }

        return result;
    }
}