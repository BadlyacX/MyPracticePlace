package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure.for_loop;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
