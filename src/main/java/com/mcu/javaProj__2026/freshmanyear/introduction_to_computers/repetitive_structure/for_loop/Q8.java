package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure.for_loop;

import java.util.Scanner;

@SuppressWarnings("DuplicatedCode")
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = (sc.nextInt() + 1) / 2;
        for (int i = 1; i <= m; i++) {
            draw(i, m);
        }

        for (int i = m - 1; i >= 1; i--) {
            draw(i, m);
        }
    }

    public static void draw(int i, int m) {
        for (int j = 1; j <= m - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

