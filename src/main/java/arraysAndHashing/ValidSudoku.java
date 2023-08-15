package arraysAndHashing;

import java.util.HashSet;
import java.util.Set;

class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0;i < 9;i++){
            Set<Character> charMap = new HashSet<>();
            for(int j = 0;j < 9;j++){
                if(board[i][j] != '.' && !charMap.add(board[i][j])) {
                    return false;
                }
            }
        }

        for(int i = 0;i < 9;i++){
            Set<Character> charMap = new HashSet<>();
            for(int j = 0;j < 9;j++){
                if(board[j][i] != '.' && !charMap.add(board[j][i])) {
                    return false;
                }
            }
        }


        // This may be a ton of nested for loops, but its still O(1) so...
        for(int x = 0;x < 9;x += 3){
            for(int y = 0;y < 9;y += 3){
                Set<Character> charMap = new HashSet<>();
                for(int i = x;i < (x+3);i++){
                    for(int j = y;j < (y+3);j++){
                        if(board[i][j] != '.' && !charMap.add(board[i][j])) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}