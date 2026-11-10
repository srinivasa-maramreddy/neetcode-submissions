class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
          
            for(int j=i+1;j<prices.length;j++){
               int profit=prices[j]-prices[i];
            
            if(profit>max){
                max=profit;
            }
           
        }
        
        }
        if (max < 0) {
            return 0;
        }
        return max;
        
    }
}
