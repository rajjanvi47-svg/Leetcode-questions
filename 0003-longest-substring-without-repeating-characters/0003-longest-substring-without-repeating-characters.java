
class Solution {
    public int lengthOfLongestSubstring(String s) {

        boolean[] visited = new boolean[128];

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (visited[s.charAt(right)]) {
                visited[s.charAt(left)] = false;
                left++;
            }

            visited[s.charAt(right)] = true;

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
