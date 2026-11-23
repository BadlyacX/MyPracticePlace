package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        int attempts = 0;

        while (attempts < 3) {
            int input = sc.nextInt();
            if (input == password) {
                System.out.println("密碼正確！");
                break;
            }
            attempts++;
            System.out.println("第" + attempts + "幾次輸入不符合，注意只有3次");
        }
    }
}
