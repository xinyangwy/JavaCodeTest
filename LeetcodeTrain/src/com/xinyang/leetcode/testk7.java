package com.xinyang.leetcode;

import java.util.*;

public class testk7 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 4);
        map.put("B", 3);
        map.put("C", 2);
        map.put("D", 1);
        map.put("F", 0);

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] items = str.trim().split(" ");
            int sum = 0;
            boolean flag = false;
            for (String item : items) {
                if (!map.containsKey(item)) {
                    flag = true;
                    break;
                }
                sum += map.getOrDefault(item,0);
            }
            if (flag == true) {
                System.out.println("Unknown");
            }else{
                System.out.printf("%.2f\n",(double)sum / items.length);
            }
        }
    }
}
