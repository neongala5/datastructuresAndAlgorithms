package com.carlos.datastructuresandalgorithms.Heaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

class DesignTwitter {
    HashMap<Integer, ArrayList<int[]>> tweets = new HashMap<>();
    HashMap<Integer, ArrayList<Integer>> followers = new HashMap<>();
    int time =   0;

    public DesignTwitter() {}

    public void postTweet(int userId, int tweetId) {
        if(!tweets.containsKey(userId)) tweets.put(userId, new ArrayList<int[]>());

        if(!followers.containsKey(userId)) {
            followers.put(userId, new ArrayList<Integer>());
            followers.get(userId).add(userId); // so he can follow himself;
        }

        tweets.get(userId).add(new int[] {tweetId,++time});
    }

    public List<Integer> getNewsFeed(int userId) {
        if(!followers.containsKey(userId)) return new ArrayList<Integer>();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        System.out.println(followers.get(userId));

        for(Integer followee : followers.get(userId)) {
            if(tweets.containsKey(followee)) maxHeap.addAll(tweets.get(followee));
        }

        List<Integer> newsFeed = new ArrayList<>();

        int totalRetreivedItems = Math.min(maxHeap.size(), 10);
        for(int i = 0; i < totalRetreivedItems; i ++) {
            newsFeed.add(maxHeap.poll()[0]);
        }

        return newsFeed;

    }

    public void follow(int followerId, int followeeId) {
        if(!tweets.containsKey(followerId)) tweets.put(followerId, new ArrayList<int[]>());
        if(!followers.containsKey(followerId)) {
            followers.put(followerId, new ArrayList<Integer>());
            followers.get(followerId).add(followerId); // so he can follow himself;
        }
        if(!followers.get(followerId).contains(followeeId)){
            followers.get(followerId).add(followeeId); // so he can follow the other person;
        }
    }

    public void unfollow(int followerId, int followeeId) {

        int indexOfFollowee = followers.get(followerId).indexOf(followeeId); // will give -1 if cant find

        // -1 means if the followee is even in the index
        if(indexOfFollowee != -1) {
            followers.get(followerId).remove(indexOfFollowee);
        }
    }
}