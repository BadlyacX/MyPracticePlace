package com.mcu.javaProj__2026.java_practice_platform.hard;

import java.util.Scanner;

public class MultipleThreads {

    static class CTest extends Thread {
        private final String id;
        private final int n;
        int count = 0;

        public CTest(String id, int n) {
            this.id = id;
            this.n = n;
        }

        @Override
        public void run() {
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) count++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        CTest cTestA = new CTest(sc.next(), sc.nextInt());
        CTest cTestB = new CTest(sc.next(), sc.nextInt());

        cTestA.start();
        cTestB.start();

        cTestA.join();
        cTestB.join();

        System.out.println(cTestA.id + ": " + cTestA.count);
        System.out.println(cTestB.id + ": " + cTestB.count);
    }
}
