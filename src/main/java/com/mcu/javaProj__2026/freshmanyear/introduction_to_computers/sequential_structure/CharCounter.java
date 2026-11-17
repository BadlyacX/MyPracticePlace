package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.sequential_structure;

import java.util.Scanner;

public class CharCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        // example: AB BA
        char[] chars =  s.toCharArray();
        char second_char = chars[1];
        int length = chars.length;

        System.out.println("總共" + length + "個字元, " + "第二個字" + second_char);

        sc.close();
    }
}