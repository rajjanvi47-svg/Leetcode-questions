
class Solution {
    public boolean isPalindrome(String s) {

        String strs = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        for (int i = 0; i < strs.length() / 2; i++) {

            if (strs.charAt(i) != strs.charAt(strs.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
