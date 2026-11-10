class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){

                        List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
                       
                        triplet.sort(null);

                        if(!result.contains(triplet)){
                            result.add(triplet);
                        }
                    }
                }
            }
        }

        return result;
    }
}
