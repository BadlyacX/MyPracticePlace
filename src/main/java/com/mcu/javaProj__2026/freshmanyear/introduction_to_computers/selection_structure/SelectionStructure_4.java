package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.selection_structure;

import java.util.Scanner;

public class SelectionStructure_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        }

        sc.close();
    }
}
