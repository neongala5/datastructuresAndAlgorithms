package com.carlos.datastructuresandalgorithms.Graphs;

import java.util.Queue;
import java.util.ArrayDeque;
class WallsAndGates {
    public void wallsAndGates(int[][] rooms) {
        Queue<int[]> gateQueue = new ArrayDeque<>();

        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++) {
                if(rooms[i][j] == 0) gateQueue.add(new int[] {i,j});
            }
        }

        int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        //turns out i didnt need this. can just do roomIWasAtBefore + 1 or something instead
        int distanceFromGate = 1;
        while(!gateQueue.isEmpty()) {
            int newRoomsFound = 0;
            // important to always store the size of the queue instead of using it in the for loop directly
            // otherwise, bugs WILL occur.
            int sizeThisRound = gateQueue.size();

            //turns out i didnt need this for loop either. can just do roomIWasAtBefore + 1 or something instead
            for(int i =0; i < sizeThisRound; i++) {
                int[] currGate = gateQueue.poll();

                int x = currGate[0];
                int y = currGate[1];

                for(int[] d : directions) {
                    int xNeighbor = x + d[0];
                    int yNeighbor = y + d[1];
                    if(xNeighbor >= 0 && xNeighbor < rooms.length && yNeighbor >= 0 && yNeighbor < rooms[0].length){
                        if(rooms[xNeighbor][yNeighbor] == Integer.MAX_VALUE){
                            rooms[xNeighbor][yNeighbor] = distanceFromGate;
                            newRoomsFound++;
                            gateQueue.add(new int[] {xNeighbor, yNeighbor});
                        }
                    }
                }
            }

            distanceFromGate++;

            if(newRoomsFound == 0) break;

        }
    }
}