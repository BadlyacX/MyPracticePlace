package com.mcu.javaProj__2026.freshmanyear.introduction_to_computers.repetitive_structure;

public class SimpleGame {
    public static void main(String[] args) {
        int monsterHp = 100;
        int rounds = 0;
        while (monsterHp > 0) {
            int damage = (int) (Math.random() * 30) + 1;
            monsterHp -= damage;
            rounds++;

            System.out.printf("第%d回合: 怪物受到%d點傷害\n", rounds, damage);
        }
        System.out.println("打倒怪物了");
    }
}
