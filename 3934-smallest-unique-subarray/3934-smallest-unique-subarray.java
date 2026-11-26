
import java.util.*;

class Solution {
    static final long MOD1 = 1000000007L;
    static final long MOD2 = 1000000009L;
    static final long BASE = 911382323L;

    public int smallestUniqueSubarray(int[] nums) {

        int n = nums.length;

        long[] pow1 = new long[n + 1];
        long[] pow2 = new long[n + 1];

        long[] hash1 = new long[n + 1];
        long[] hash2 = new long[n + 1];

        pow1[0] = 1;
        pow2[0] = 1;

        // Build prefix hashes
        for (int i = 0; i < n; i++) {

            pow1[i + 1] = (pow1[i] * BASE) % MOD1;
            pow2[i + 1] = (pow2[i] * BASE) % MOD2;

            hash1[i + 1] =
                (hash1[i] * BASE + nums[i]) % MOD1;

            hash2[i + 1] =
                (hash2[i] * BASE + nums[i]) % MOD2;
        }

        int left = 1;
        int right = n;
        int answer = n;

        // Binary Search
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (isUnique(mid, n, hash1, hash2, pow1, pow2)) {

                answer = mid;
                right = mid - 1;

            } else {

                left = mid + 1;
            }
        }

        return answer;
    }

    // Check whether a unique subarray of given length exists
    private boolean isUnique(
        int len,
        int n,
        long[] hash1,
        long[] hash2,
        long[] pow1,
        long[] pow2
    ) {

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i <= n - len; i++) {

            long h1 = (hash1[i + len]
                - hash1[i] * pow1[len] % MOD1
                + MOD1) % MOD1;

            long h2 = (hash2[i + len]
                - hash2[i] * pow2[len] % MOD2
                + MOD2) % MOD2;

            long key = h1 * MOD2 + h2;

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // Check if any subarray occurs exactly once
        for (int count : map.values()) {

            if (count == 1) {
                return true;
            }
        }

        return false;
    }
}
