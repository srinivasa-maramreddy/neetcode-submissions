class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // count freq
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // convert map -> pair array
        int size = map.size();
        int[][] pair = new int[size][2];
        int idx = 0;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            pair[idx][0] = e.getKey();
            pair[idx][1] = e.getValue();
            idx++;
        }

        // bucket array: freq -> list of keys
        int[][] bucket = new int[n + 1][size];
        int[] count = new int[n + 1];  // how many keys stored at each freq

        // fill bucket
        for (int i = 0; i < size; i++) {
            int key = pair[i][0];
            int freq = pair[i][1];

            bucket[freq][ count[freq] ] = key;
            count[freq]++;
        }

        // take top k
        int[] res = new int[k];
        int r = 0;

        for (int f = n; f > 0 && r < k; f--) {
            for (int col = 0; col < count[f] && r < k; col++) {
                res[r++] = bucket[f][col];
            }
        }

        return res;
    }
}
