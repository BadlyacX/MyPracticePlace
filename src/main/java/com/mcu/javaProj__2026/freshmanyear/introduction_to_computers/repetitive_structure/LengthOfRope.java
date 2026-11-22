package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure;

import java.util.Scanner;

public class LengthOfRope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthOfRope = sc.nextInt();
        int n = 0;

        while (lengthOfRope >= 3) {
            lengthOfRope = lengthOfRope / 2;
            n++;
        }

        System.out.print("對折" + n + "次");
    }
}
