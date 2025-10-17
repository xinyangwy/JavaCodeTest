package com.xinyang.leetcode;

import java.util.Arrays;

public class test2502 {
}


class Allocator {
    private final int[] memory;
    public Allocator(int n) {
        memory = new int[n];
    }

    public int allocate(int size, int mID) {
        int freeCnt=0;
        for(int i=0;i<memory.length;i++){
            if(memory[i]!=0){
                freeCnt=0;
                continue;
            }else{
                freeCnt++;
                if(freeCnt==size){
                    Arrays.fill(memory,i-size+1,i+1,mID);
                    return i-size+1;
                }
            }
        }
        return -1;
    }

    public int freeMemory(int mID) {
        int cnt=0;
        for(int i=0;i< memory.length;i++){
            if(memory[i]==mID){
                cnt++;
                memory[i]=0;
            }
        }
        return cnt;
    }
}

/**
 * Your Allocator object will be instantiated and called as such:
 * Allocator obj = new Allocator(n);
 * int param_1 = obj.allocate(size,mID);
 * int param_2 = obj.freeMemory(mID);
 */