import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<String>s=new ArrayList<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                char a=board[i][j];
                String s1="r"+i+a;
                String s2="c"+j+a;
                String s3="b"+(i/3)+"-"+(j/3)+a;
                if(s.contains(s1)||s.contains(s2)||s.contains(s3))
                    return false;
                s.add(s1);
                s.add(s2);
                s.add(s3);
            }}
        }
        return true;
    }
}