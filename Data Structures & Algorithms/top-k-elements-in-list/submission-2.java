class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i=0;i<n;i++){
       
         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       Map.Entry<Integer,Integer>[]m=map.entrySet().toArray(new Map.Entry[0]);
            int[][]arr=new int[m.length+1][2];
         for(int i=0;i<m.length;i++){
          arr[i][0]=m[i].getKey();
           arr[i][1]=m[i].getValue();
         }
         for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length-1-i;j++){
            if(arr[j][1]<arr[j+1][1]){
              int keyvalue=arr[j][0];
              arr[j][0]=arr[j+1][0];
              arr[j+1][0]=keyvalue;

              int freqvalue=arr[j][1];
              arr[j][1]=arr[j+1][1];
              arr[j+1][1]=freqvalue;
            }
          }
         }
         int[]res=new int[k];
         for(int i=0;i<k;i++){
          res[i]=arr[i][0];
         }
         return res;
    }
       }
