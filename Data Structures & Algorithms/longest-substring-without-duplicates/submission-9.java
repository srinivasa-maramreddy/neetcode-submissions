class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        int n = s.length();
        int max = 0;

        for (int i = 0; i < n; i++) {

            int[] seen = new int[128];
            int length = 0;

            for (int j = i; j < n; j++) {

                if (seen[s.charAt(j)] == 1) {   // FIXED
                    break;
                }

                seen[s.charAt(j)] = 1;         // FIXED
                length++;

                max = Math.max(max, length);
            }
        }

        return max;
    }
}
