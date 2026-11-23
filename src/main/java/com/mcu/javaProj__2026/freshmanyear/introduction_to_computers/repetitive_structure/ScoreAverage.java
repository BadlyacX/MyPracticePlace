package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure;

import java.util.Scanner;

public class ScoreAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int total = 0;
        while (true) {
            int score = sc.nextInt();
            if (score == -1) {
                System.out.println("輸入資料結束！");
                break;
            }

            total += score;
            n++;
        }

        System.out.printf("%d人，總平均%.2f", n, (double) total / n);
    }
}
