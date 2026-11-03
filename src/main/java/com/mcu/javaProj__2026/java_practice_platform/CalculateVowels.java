package com.mcu.javaProj__2026.java_practice_platform;

import java.util.Scanner;

public class CalculateVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int count = countVowels(line);
        System.out.println(count);
    }

    public static int countVowels(String str) {
        int count = 0;
        char[] vowels =  {'a', 'e', 'i', 'o', 'u'};
        char[] strArr = str.toLowerCase().toCharArray();

        for (char c : strArr) {
            for (int i =0; i < vowels.length; i++) {
                if (c == vowels[i]) count++;
            }
        }
        return count;
    }
}

