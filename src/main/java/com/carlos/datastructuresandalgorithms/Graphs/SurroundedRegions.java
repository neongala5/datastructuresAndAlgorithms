package com.carlos.datastructuresandalgorithms.Graphs;


class SurroundedRegions {
    public void solve(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'O'){
                    if(i == 0 || i == board.length - 1){
                        dfs(i,j,board);
                    } else if(j == 0 || j == board[0].length -1) {
                        dfs(i,j,board);
                        // i made a tiny, almost insignificant optimization here.
                        // so i don't need this line at all but why not':
                        j += board[0].length -2;
                    }
                }
            }
        }

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == '*') board[i][j] = 'O';
            }
        }
    }

    public void dfs(int i, int j, char[][] board) {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == 'X' || board[i][j] == '*') return;

        // change to some special character so it can be left alone later.
        board[i][j] = '*';

        dfs(i+1,j,board);
        dfs(i-1,j,board);
        dfs(i,j+1,board);
        dfs(i,j-1,board);
    }
}