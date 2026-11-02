package com.mcu.javaProj__20261001.大一程設;

public class CharacterCode {
    public static void main(String[] args) {
        for (int i = 0; i <= 65535; i++) {
            char ch = (char) i;
            System.out.println(ch + ": " + i);
        }
    }
}
