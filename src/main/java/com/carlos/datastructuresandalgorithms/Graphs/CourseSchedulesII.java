package com.carlos.datastructuresandalgorithms.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class CourseSchedulesII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        ArrayList<ArrayList<Integer>> prereqList = new ArrayList<>();

        for(int i = 0; i < numCourses; i++) {
            prereqList.add(new ArrayList<>());
        }

        for(int[] prerequisite : prerequisites) {
            prereqList.get(prerequisite[1]).add(prerequisite[0]);
            indegrees[prerequisite[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        ArrayList<Integer> coursePath = new ArrayList<>();

        for(int i = 0; i < numCourses; i++) {
            if(indegrees[i] == 0) {
                queue.offer(i);
            }
        }

        int nodesVisited = 0;

        while(!queue.isEmpty()) {
            int node = queue.poll();
            coursePath.add(node);
            nodesVisited++;

            for(int neighbor : prereqList.get(node)) {
                indegrees[neighbor]--;
                if(indegrees[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }

        }

        if(nodesVisited != numCourses) {

            return new int[0];
        } else {
            int[] answer = new int[coursePath.size()];
            for(int i = 0; i < coursePath.size(); i++) {
                answer[i] = coursePath.get(i);
            }

            return answer;
        }
    }
}