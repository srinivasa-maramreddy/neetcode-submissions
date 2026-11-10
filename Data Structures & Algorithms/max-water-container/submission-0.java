class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int maxarea=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int min=Math.min(heights[i],heights[j]);
                int h=j-i;
                int area=min*h;
            
            if(maxarea<area){
                maxarea=area;
            }
        }}
        return maxarea;
    }
}
