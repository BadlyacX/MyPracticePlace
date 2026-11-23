package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure;

import java.util.Scanner;

public class ScoreInputCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int total = 0;
        int attempts = 0;

        while (attempts <= 2) {
            int score = sc.nextInt();

            if (score == -1) {
                System.out.println("輸入資料結束！");
                break;
            }
            if (score >= 0 && score <= 100) {
                total += score;
                n++;
            } else {
                attempts++;
                System.out.println("資料錯誤，必須是0與100之間的正整數，請重新輸入，有3次機會");
            }
        }
        System.out.printf("%d人，總平均%.2f", n, (double) total / n);
    }
}

