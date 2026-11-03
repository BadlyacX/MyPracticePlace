package com.mcu.javaProj__2026;

public class TestJava_15130061_張格睿_20261012b {

    public static void main(String[] args) {
        m6(15);
        m6(16);
        System.out.println("----------------------------------");
        for (int i = 0; i <= 12; i++) m7(i);
        System.out.println("----------------------------------");
        m8();
    }

    public static void m6(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " is an even number");
        } else {
            System.out.println(a + " is an odd number");
        }
    }

    public static void m7(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Unknown Season");
                break;
        }
    }

    public static void m8() {
        int sum = 0;
        int i = 1;
        for (; i <= 100; i++) {
            if (i % 2 == 0) break;

            sum += i;

            if (i % 2 == 0) break;
        }
    }
}
