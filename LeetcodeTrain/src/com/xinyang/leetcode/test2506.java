package com.xinyang.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class test2506 {
}

class Solution2506 {
    public int similarPairs(String[] words) {
        List<String> tmp=new ArrayList<>();
        int n=words.length;
        HashMap<String,Integer> res=new HashMap<>();
        for (String word : words){
            HashSet<Character> uniqueStr = new HashSet<>();
            for (char c : word.toCharArray()) {
                uniqueStr.add(c);
            }
            String key = uniqueStr.toString();
            res.put(key, res.getOrDefault(uniqueStr, 0) + 1);
        }        HashSet<Character> hashchar1=new HashSet<>();
        hashchar1.add('a');
        hashchar1.add('b');
        hashchar1.add('c');

        HashSet<Character> hashchar2=new HashSet<>();
        hashchar2.add('c');
        hashchar2.add('a');
        hashchar2.add('b');

        int sum=0;
        for(Integer i : res.values()){
            sum+=(i*(i-1))/2;
        }
        return sum;
    }
}
