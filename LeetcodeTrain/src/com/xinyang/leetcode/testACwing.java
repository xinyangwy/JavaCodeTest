package com.xinyang.leetcode;

import java.util.Scanner;
import java.util.Stack;

public class testACwing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int len= sc.nextInt();
        int distince[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            distince[i]=sc.nextInt();
        }
        int prices[]=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        sloutionAc s=new sloutionAc();
        System.out.println(s.fun(n,len,distince,prices));
    }
}


class sloutionAc{
    public static int fun(int n,int len,int []distince,int []prices){
        int more=0,moreLen=0,total=0;
        Stack<Integer> stk=new Stack<>();
        stk.push(0);
        for(int d=0,i=1;i<n-1;i++){
            if(prices[i]>=prices[stk.peek()]){
                stk.push(i);
            }else{
                while(!stk.isEmpty() && prices[stk.peek()]>=prices[i]){
                    if(stk.size()==1){
                        d=stk.peek();
                    }
                    stk.pop();
                }
                stk.push(i);//找到了右边第一个最小的

                System.out.println(i);
                int sum=0;
                for(int k=d;k<i;k++){
                    sum+=distince[k];
                }
                moreLen=sum-more;//需要走的路
                int cnt=moreLen%len==0?(moreLen/len):(moreLen/len+1);
//                System.out.println(d+" " +cnt);
                total+=cnt*prices[d];
                more=more + cnt*len-sum;//多余走的路
            }
        }
        if(more<distince[n-2]){
            int cnt=(distince[n-2]-more)%len==0?((distince[n-2]-more)/len):((distince[n-2]-more)%len+1);
            total+=cnt*prices[n-2];
        }
        return total;
    }
}