package com.mcu.javaProj__2026.freshmanyear.programming_course.exercises;

public class CharacterCode {
    public static void main(String[] args) {
        for (int i = 0; i <= 65535; i++) {
            char ch = (char) i;
            System.out.println(ch + ": " + i);
        }
    }
}
