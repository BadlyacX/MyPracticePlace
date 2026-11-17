package com.mcu.javaProj__2026.freshmanyear.programming_course.week11;

import java.util.Scanner;

public class PasswordVerification {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        // TODO
        while (true) {
            int input = sc.nextInt();
            if (input == password) {
                System.out.printf("密碼%d正確!", input);
                break;
            }
            System.out.printf("密碼%d錯誤!請再輸入一次\n", input);
        }
    }
}