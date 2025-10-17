package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test2353_ {
}

class FoodRatings {
    class Foods{
        String name;
        String cuisine;
        int rating;

        public Foods(String name, String cuisine, int rating) {
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }
    }
    Foods []f;
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        int n=foods.length;
        f=new Foods[n];
        for(int i=0;i<n;i++){
            f[i] = new Foods(foods[i], cuisines[i], ratings[i]); // 初始化每个元素
        }
    }

    public void changeRating(String food, int newRating) {
        for (Foods foods : f) {
            if(foods.name.equals(food)){
                foods.rating=newRating;
            }
        }
    }

    public String highestRated(String cuisine) {
        List<Foods> res=new ArrayList<>();
        for (Foods foods : f) {
            if(foods.cuisine.equals(cuisine)){
                res.add(foods);
            }
        }
        Collections.sort(res, (o1, o2) -> {
            if (o2.rating == o1.rating) {
                return o1.name.compareTo(o2.name); // 字典序升序
            }
            return o2.rating - o1.rating; // 评分降序
        });
        if (!res.isEmpty()) {
            return res.get(0).name;
        }
        return null; // 如果没有符合条件的食物，返回 null
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */
