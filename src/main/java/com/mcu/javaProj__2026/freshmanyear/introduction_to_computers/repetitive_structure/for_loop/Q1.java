package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure.for_loop;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " * " + i + " = " + i*i);
        }
    }
}
