
import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] mul = new int[nums.length];

        // Step 1: Square every element
        for (int i = 0; i < nums.length; i++) {
            mul[i] = nums[i] * nums[i];
        }

        // Step 2: Sort the squared array
        Arrays.sort(mul);

        // Step 3: Return the result
        return mul;
    }
}
