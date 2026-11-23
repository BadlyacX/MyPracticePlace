package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure.for_loop;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = 0;

        for (int i = a; i <= b; i++) {
            t += i;
        }

        System.out.println(t);
    }
}
