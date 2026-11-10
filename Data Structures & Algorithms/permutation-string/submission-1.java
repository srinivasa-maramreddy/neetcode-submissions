class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2) return false;
        HashMap<Character,Integer>map1=new HashMap<>();
        for(int i=0;i<n1;i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0)+1);
        }
        int need=map1.size();
        for(int i=0;i<n2;i++){
            HashMap<Character,Integer>map2=new HashMap<>();
            int curr=0;
            for(int j=i;j<n2;j++){
                if (!map1.containsKey(s2.charAt(j))) break;

                map2.put(s2.charAt(j),map2.getOrDefault(s2.charAt(j),0)+1);
                if(map1.get(s2.charAt(j))<map2.get(s2.charAt(j))){
                    break;
                }
                 if(map1.get(s2.charAt(j))==map2.get(s2.charAt(j))){
                   curr++;
                }
                if(curr==need){
                    return true;
                }
            }
        }
        return false;

    }
}