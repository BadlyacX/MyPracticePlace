package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure.for_loop;

public class Q3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 16 == 0) a += i;
            if (i % 2 == 0 && i % 5 == 0) b += i;
            if (i % 3 == 0 && i % 7 == 0) c += i;
        }

        System.out.println("可以被16整除的數的總和: " + a);
        System.out.println("可以被2和5整除的數的總和: " + b);
        System.out.println("可以被3和7整除的數的總和: " + c);
    }
}
