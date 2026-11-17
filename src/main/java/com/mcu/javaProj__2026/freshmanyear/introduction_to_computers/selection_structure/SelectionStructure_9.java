package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.selection_structure;

import java.util.Scanner;

public class SelectionStructure_9 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int baseSalary = sc.nextInt();

        if (time <= 40) {
            System.out.printf("工時%s小時, 薪資%s", time, time * baseSalary);
        } else if (time <= 60) {
            System.out.printf("工時%s小時, 薪資%s", time, time * baseSalary * (1.33));
        } else if (time <= 80) {
            System.out.printf("工時%s小時, 薪資%s", time, time * baseSalary * (1.33 + 1.66));
        } else if (time <= 120) {
            System.out.printf("工時%s小時, 薪資%s", time, time * baseSalary * (1.33 + 1.66 + 2));
        }
    }
}
