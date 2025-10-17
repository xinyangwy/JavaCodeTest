package com.xinyang.leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import java.util.*;

public class review {
    public static void main(String[] args) {
        String input = "RRRRGGGGGGBGGBBBB";
        processString(input);
    }

    public static void processString(String input) {
        List<Character> charList = new ArrayList<>();
        for (char c : input.toCharArray()) {
            charList.add(c);
        }
        boolean[] used = new boolean[input.length()];

        while (true) {
            int maxLength = 0;
            int startIndex = -1;
            char maxColor = ' ';
            int currentLength = 0;
            int currentStart = -1;
            char currentColor = ' ';

            for (int i = 0; i < charList.size(); i++) {
                if (used[i]) {
                    continue;
                }
                if (currentStart == -1) {
                    currentStart = i;
                    currentColor = charList.get(i);
                    currentLength = 1;
                } else if (charList.get(i) == currentColor) {
                    currentLength++;
                } else {
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                        startIndex = currentStart;
                        maxColor = currentColor;
                    }
                    currentStart = i;
                    currentColor = charList.get(i);
                    currentLength = 1;
                }
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                startIndex = currentStart;
                maxColor = currentColor;
            }

            if (maxLength == 0) {
                break;
            }

            System.out.print(maxColor);
            for (int i = startIndex; i < startIndex + maxLength; i++) {
                System.out.print(" " + (i + 1));
                used[i] = true;
            }
            System.out.println();
        }
    }
}