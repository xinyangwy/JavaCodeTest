package com.xinyang.leetcode;

import java.util.*;

public class test1656 {
}


class OrderedStream {
    String arr[];
    int ptr;
    public OrderedStream(int n) {
        arr=new String[n];
        ptr=1;
    }

    public List<String> insert(int idKey, String value) {
        if(idKey<arr.length){
            arr[idKey]=value;

            List<String> res=new ArrayList<>();
            if(idKey==ptr){
                while(arr[idKey] != null){
                    res.add(arr[idKey]);
                    idKey++;
                }
                ptr++;
                return res;
            }
        }

        return new ArrayList<>();
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */