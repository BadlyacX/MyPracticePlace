package com.mcu.javaProj__2026.java_practice_platform;

import java.util.Scanner;

public class IntegerVectorAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++)
            vector1[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            vector2[i] = sc.nextInt();


        for (int i = 0; i < n; i++)
            result[i] = vector1[i] + vector2[i];


        for (int v : result)
            System.out.print(v + " ");

    }
}
