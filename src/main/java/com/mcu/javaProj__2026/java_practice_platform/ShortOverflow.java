package com.mcu.javaProj__2026.java_practice_platform;

import java.util.Scanner;

public class ShortOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short a = sc.nextShort(), b = sc.nextShort();
        int result = a + b;
        System.out.println("short:" + (short) result);
        System.out.print("int:" + result);
    }
}
