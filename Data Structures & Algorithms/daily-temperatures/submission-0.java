class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
       int[]result=new int[n];
       Arrays.fill(result,0);
       Stack<Integer>s=new Stack();
       for(int i=0;i<n;i++){
       while(!s.isEmpty()&&temperatures[s.peek()]<temperatures[i]){
        int x=s.pop();
        result[x]=i-x;
       }
       s.push(i);
    }
    return result;
    }
}
