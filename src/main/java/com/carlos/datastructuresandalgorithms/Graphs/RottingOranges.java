package com.carlos.datastructuresandalgorithms.Graphs;

import java.util.ArrayDeque;
import java.util.Queue;

// This one was pretty hard for me. should review this and the documented answer. Was first attempt at using BFS in a graph
class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        Queue<int[]> rottenQueue = new ArrayDeque<>();

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) fresh++;
                if(grid[i][j] == 2) rottenQueue.add(new int[] {i,j});
            }
        }

        int minutes = 0;
        int[][] directions = { {-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        while(fresh > 0 && rottenQueue.size() > 0) {
            int bfsRotOrangesThisRound = rottenQueue.size();

            for(int i = 0; i < bfsRotOrangesThisRound; i++) {
                int[] currOrange = rottenQueue.poll();

                int x = currOrange[0];
                int y = currOrange[1];

                for(int[] d : directions) {
                    int xNeighbor = x + d[0];
                    int yNeighbor = y + d[1];
                    if(xNeighbor >= 0 && xNeighbor < grid.length && yNeighbor >= 0 && yNeighbor < grid[0].length) {
                        if(grid[xNeighbor][yNeighbor] == 1) {
                            grid[xNeighbor][yNeighbor] = 2;
                            rottenQueue.add(new int[] {xNeighbor, yNeighbor});

                            fresh--;
                        }
                    }
                }
            }

            minutes++;

        }
        return fresh == 0 ? minutes : -1;
    }
}