package com.xinyang.leetcode;

import java.awt.*;
import java.util.*;
import java.util.List;

public class test355 {
}

class Twitter {
    class post{
        int userId;
        int tweetId;
        post(int userId,int tweetId){
            this.userId=userId;
            this.tweetId=tweetId;
        }
    }
    Map<Integer,HashSet<Integer>> map=new HashMap<>();
    List<post> allpost;
    public Twitter() {
        allpost=new ArrayList<>();
    }

    public void postTweet(int userId, int tweetId) {
        follow(userId,userId);
        allpost.add(0,new post(userId,tweetId));
    }

    public List<Integer> getNewsFeed(int userId) {
        int cnt=0;
        List<Integer> res=new ArrayList<>();
        HashSet<Integer> set=map.getOrDefault(userId,new HashSet<>());
        if(set.isEmpty()){
            return new ArrayList<>();
        }
        for (post p : allpost) {
            if(set.contains(p.userId)){
                res.add(p.tweetId);
                cnt++;
                if(cnt==10){
                    break;
                }
            }
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        HashSet<Integer> set=map.getOrDefault(followerId,new HashSet<>());
        set.add(followeeId);
        map.put(followerId,set);
    }

    public void unfollow(int followerId, int followeeId) {
        if(!map.containsKey(followerId)){
            return;
        }
        HashSet<Integer> set=map.getOrDefault(followerId,new HashSet<>());
        set.remove(followeeId);
        map.put(followerId,set);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */


/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */