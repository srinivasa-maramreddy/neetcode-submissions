class Solution {
    public boolean isValidSudoku(char[][] board) {
      HashSet<String>set=new HashSet<>();
      for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            char nums=board[i][j];
            if (nums == '.') continue;

            String rowkey = nums + " in r" + i;
            String colkey = nums + " in " + j;
            String boxkey = nums + " in " + (i/3) + "-" + (j/3);

        if(!set.add(rowkey)||!set.add(colkey)||!set.add(boxkey)){
            return false;
        }
      }}
      return true;
    }
}
