class Solution {
    public int lengthOfLongestSubstring(String s) {

        char[] arr = s.toCharArray();
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            int[] seen = new int[256];  // using int instead of boolean
            int length = 0;

            for (int j = i; j < arr.length; j++) {

                if (seen[arr[j]] == 1) {   // char already repeated
                    break;
                }

                seen[arr[j]] = 1;   // mark character as seen
                length++;           // extend substring

                max = Math.max(max, length);
            }
        }

        return max;
    }
}
