package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = false;
        int number = sc.nextInt();

        int i = 2;
        int j = 2;
        while (i <= number) {
            isPrime = false;

            while (j <= Math.sqrt(i)) {
                if (i % j == 0) isPrime = true;
                j++;
            }
            i++;
        }
        System.out.println(isPrime ? "此數為質數" : "此數不是質數"); // undone
    }
}
