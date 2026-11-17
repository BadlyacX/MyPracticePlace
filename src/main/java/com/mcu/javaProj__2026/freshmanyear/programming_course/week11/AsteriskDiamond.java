package com.mcu.javaProj__2026.freshmanyear.programming_course.week11;

import java.util.Scanner;

public class AsteriskDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = (sc.nextInt() + 1) / 2;
        // TODO: the top half (i = 1..m), then the bottom half (i = m-1..1)
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = m - 1; i >= 1; i--) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//   *     (3, 1)
//  ***    (2, 3)
// *****   (1, 5)
//*******  (0, 7)
// *****   (1, 5)
//  ***    (2, 3)
//   *     (3, 1)
// I don't know why I spent so much time on this shxt :SKULL: