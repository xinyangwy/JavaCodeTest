package com.xinyang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int nums[]=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        while(m!=0){
            int x=sc.nextInt();
            System.out.println(find(nums,x));
            m--;
        }
    }
    public static int find(int []nums,int x) {
        int l=0,r=nums.length-1;
        while (l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==x){
                return mid;
            }else if(nums[mid]>x){
                r=mid-1;
            }
            else if(nums[mid]<x){
                l=mid+1;
            }
        }
        return -1;
    }
}
