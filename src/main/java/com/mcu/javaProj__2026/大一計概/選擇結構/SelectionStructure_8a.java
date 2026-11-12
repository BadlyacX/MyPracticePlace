package com.mcu.javaProj__2026.大一計概.選擇結構;

import java.util.Scanner;

public class SelectionStructure_8a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();

        if (price <= 500) {
            printPrice(price, 9);
        }
        if (price >= 501 && price <= 999) {
            printPrice(price, 8.5f);
        }
        if (price >= 1000 && price <= 1999) {
            printPrice(price, 8);
        }
        if (price >= 2000 && price <= 4999) {
            printPrice(price, 7);
        }
        if (price >= 5000) {
            printPrice(price, 6);
        }

        sc.close();
    }

    static void printPrice(int price, float discount) {
        System.out.printf("可打%s折，折後為%.1f元%n", discount, price * discount / 10);
    }
}
