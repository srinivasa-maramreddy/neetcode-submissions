class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;

        // Step 1: Count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Create bucket array of lists
        List<Integer>[] arr = new ArrayList[n + 1];  // index = frequency

        // Step 3: Convert map entries to array (NO foreach)
        Map.Entry<Integer, Integer>[] m = map.entrySet().toArray(new Map.Entry[0]);

        // Step 4: Insert values into the correct frequency bucket
        for (int i = 0; i < m.length; i++) {
            int num = m[i].getKey();
            int freq = m[i].getValue();

            if (arr[freq] == null) {
                arr[freq] = new ArrayList<>();
            }

            arr[freq].add(num);
        }

        // Step 5: Collect result from highest frequency buckets
        int[] res = new int[k];
        int idx = 0;

        for (int i = n; i >= 0 && idx < k; i--) {
            if (arr[i] != null) {

                // add from arr[i]
                for (int j = 0; j < arr[i].size() && idx < k; j++) {
                    res[idx++] = arr[i].get(j);
                }
            }
        }

        return res;
    }
}
