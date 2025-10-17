package com.xinyang.leetcode;

public class test43 {
    public static void main(String[] args) {
        Solution43 s=new Solution43();
        System.out.println(s.multiply("123","456"));
    }
}



class Solution43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String res = "0";
        for (int i = num2.length() - 1; i >= 0; i--) {
            StringBuilder tmp = new StringBuilder();
            for (int k = 0; k < num2.length() - 1 - i; k++) {// 倒数第二位乘的时候部1个0
                tmp.append(0);
            }
            int n2 = num2.charAt(i) - '0';
            int carry = 0;
            for (int j = num1.length() - 1; j >= 0; j--) {
                int n1 = num1.charAt(j) - '0';
                tmp.append((n1 * n2 + carry) % 10);
                carry = (n1 * n2 + carry) / 10;
            }
            if (carry != 0)
                tmp.append(carry);
            res = add(res, tmp.reverse().toString());
        }
        return res;
    }

    public String add(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            res.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
            i--;
            j--;
        }
        if (carry != 0)
            res.append(carry);
        return res.reverse().toString();
    }
}
