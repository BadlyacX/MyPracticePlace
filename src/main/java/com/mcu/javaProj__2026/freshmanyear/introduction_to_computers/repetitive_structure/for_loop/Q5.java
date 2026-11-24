package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure.for_loop;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] inputArr = input.toCharArray();

        for (int i = inputArr.length - 1; i >= 0; i--) {
            System.out.print(inputArr[i]);
        }
    }
}
