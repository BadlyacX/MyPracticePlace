package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure.while_loop;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int number = sc.nextInt();

        int i = 2;
        int j = 2;
        while (i <= number) {
            isPrime = true;

            while (j <= Math.sqrt(i)) {
                if (i % j == 0) isPrime = false;
                j++;
            }
            i++;
        }
        System.out.println(isPrime ? "此數為質數" : "此數不是質數");
    }
}
