class Solution {

    public String encode(List<String> strs) {
      String encoded="";
      for(int i=0;i<strs.size();i++){
        encoded=encoded+strs.get(i).length()+"#"+strs.get(i);
      }
      return encoded;

    }

    public List<String> decode(String str) {
      List<String>list=new ArrayList<>();
      int i=0;
      while(i<str.length()){
        int length=0;
        while(str.charAt(i)!='#'){
            length=length*10+(str.charAt(i)-'0');
            i++;
        }
        i++;
        String word="";
        for(int j=0;j<length;j++){
            word=word+str.charAt(i);
           i++;
        }
         list.add(word);
      }
      return list;
    }
}
