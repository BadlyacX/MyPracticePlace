package com.mcu.javaProj__2026.java_practice_platform.medium;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] m = new int[r][c];
        int[][] trans = new int[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
                trans[j][i] = m[i][j];
            }
        }

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}