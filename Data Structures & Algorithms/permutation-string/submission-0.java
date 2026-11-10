class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2) return false;

        // Step 1: convert s1 to array and sort it
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);

        // Step 2: check every substring of s2
        for (int start = 0; start <=n2-n1 ; start++) {

            // Step A: store the substring first
            String sub = s2.substring(start, start + n1);

            // Step B: convert stored substring into array
            char[] arr2 = sub.toCharArray();

            // Step C: sort arr2
            Arrays.sort(arr2);

            // Step D: compare arrays
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
        }

        return false;
    }
}
