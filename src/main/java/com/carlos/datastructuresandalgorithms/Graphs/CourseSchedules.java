package com.carlos.datastructuresandalgorithms.Graphs;

import java.util.*;
class CourseSchedules {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        ArrayList<ArrayList<Integer>> prereqList = new ArrayList<>(numCourses);


        for(int i = 0; i < numCourses; i++) {
            prereqList.add(new ArrayList<>());
        }
        for(int[] prerequisite : prerequisites) {
            prereqList.get(prerequisite[1]).add(prerequisite[0]);
            indegrees[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < numCourses; i ++){
            if(indegrees[i] == 0) {
                queue.offer(i);
            }
        }

        int nodesVisited = 0;

        while(!queue.isEmpty()) {
            int node = queue.poll();
            nodesVisited++;

            for(int neighbor : prereqList.get(node)) {
                indegrees[neighbor]--;
                if(indegrees[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return nodesVisited == numCourses;

    }
}