package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure.for_loop;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 15) throw new IllegalArgumentException("the value must be greater than 15");

        int c15 = 0, c3 = 0, c5 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) c3++;
            if (i % 5 == 0) c5++;
            if (i % 15 == 0) c15++;
        }

        System.out.printf(
                "3的倍數個數: %d\n 5的倍數個數: %d\n 15的倍數個數: %d", c3, c5, c15
        );
    }
}
