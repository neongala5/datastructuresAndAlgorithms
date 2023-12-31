package com.carlos.datastructuresandalgorithms.Graphs;

class MaxAreaOfIsland {
    int maxArea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    int currentIsland = dfs(i, j, grid);
                    maxArea = Math.max(currentIsland, maxArea);
                }
            }
        }
        return maxArea;
    }

    public int dfs(int i, int j, int[][] grid) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        return 1 + dfs(i + 1,j,grid) + dfs(i - 1,j,grid) + dfs(i,j + 1,grid) + dfs(i,j - 1,grid);
    }
}