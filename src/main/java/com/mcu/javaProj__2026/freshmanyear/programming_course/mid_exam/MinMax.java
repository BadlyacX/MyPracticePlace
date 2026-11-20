package com.mcu.javaProj__2026.freshmanyear.programming_course.mid_exam;

public class MinMax {

    public static void main(String[] args) {
        int[] numbers = {25, 8, 46, 12, 39};
        int min = finMin(numbers);
        System.out.println("最小值：" + min);

        int max = finMax(numbers);
        System.out.println("最大值：" + max);

        numbers = new int[] {26, 9, 49, 11, 38};
        int[] valArr = finMinMax(numbers);
        System.out.print("最小值：" + valArr[0]);
        System.out.println(" 最大值：" + valArr[1]);
    }

    static int finMin(int[] numbers) {
        int min = numbers[0];
        for (int i : numbers)
            min = Math.min(i, min);
        return min;
    }

    static int finMax(int[] numbers) {
        int max = numbers[0];
        for (int i : numbers)
            max = Math.max(i, max);
        return max;
    }

    static int[] finMinMax(int[] numbers) {
        return new int[] {finMin(numbers), finMax(numbers)};
    }
}
