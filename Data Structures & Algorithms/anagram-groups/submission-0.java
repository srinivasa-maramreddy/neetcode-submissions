class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            int[]freq=new int[26];
            for(int j=0;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
            }
            String key=Arrays.toString(freq);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
