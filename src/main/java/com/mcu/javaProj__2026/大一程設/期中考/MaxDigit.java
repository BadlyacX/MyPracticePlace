package com.mcu.javaProj__2026.大一程設.期中考;

import java.util.Scanner;

public class MaxDigit {
    public static int maxDigit(int n) {
        if (1 <= n && n <= 2 * 1000000000) {
            char[] nArr = Integer.toString(n).toCharArray();
            int max = Integer.parseInt(nArr[0] + "");

            for (char c : nArr) {
                int n1 = Integer.parseInt(c + "");
                if (n1 > max) max = n1;
            }

            return max;
        } else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(maxDigit(sc.nextInt()));
    }
}
