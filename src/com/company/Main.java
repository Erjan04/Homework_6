package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setCharacterHealth(700);
        boss.setCharacterDamage(50);
        boss.setCharacterDefence(100);
        boss.setCharacterSuperPower(120);
        System.out.println("Здоровья Босса:" + boss.getCharacterHealth());
        System.out.println("Урон от Босса:" + boss.getCharacterDamage());
        System.out.println("Сопротивляемость Босса:" + boss.getCharacterDefence());
        System.out.println("Супер-урон Босса:" + boss.getCharacterSuperPower());

        System.out.println("");

        Warrior Darius = new Warrior();
        Darius.setCharacterHealth(200);
        Darius.setCharacterDamage(20);
        Darius.setCharacterDefence(10);
        Darius.setCharacterSuperPower(70);
        System.out.println("Здоровья Дариуса:" + Darius.getCharacterHealth());
        System.out.println("Урон от Дариуса:" + Darius.getCharacterDamage());
        System.out.println("Сопротивляемость Дариуса:" + Darius.getCharacterDefence());
        System.out.println("Супер-урон Дариуса:" + Darius.getCharacterSuperPower());

        System.out.println("");

        Magical Elen = new Magical();
        Elen.setCharacterHealth(150);
        Elen.setCharacterDamage(25);
        Elen.setCharacterDefence(30);
        Elen.setCharacterSuperPower(200);
        System.out.println("Здоровья Элен:" + Elen.getCharacterHealth());
        System.out.println("Магический урон от Элен:" + Elen.getCharacterDamage());
        System.out.println("Магическая сопротивляемость Элен:" + Elen.getCharacterDefence());
        System.out.println("Взрывной урон Элен:" + Elen.getCharacterSuperPower());

        System.out.println("");

        Mental merlin = new Mental();
        merlin.setCharacterHealth(150);
        merlin.setCharacterDamage(30);
        merlin.setCharacterDefence(30);
        merlin.setCharacterSuperPower(100);
        System.out.println("Здоровья Мерлин:" + merlin.getCharacterHealth());
        System.out.println("Магический урон от Мерлин:" + merlin.getCharacterDamage());
        System.out.println("Магическая сопротивляемость Мерлин:" + merlin.getCharacterDefence());
        System.out.println("Взрывной урон Мерлин:" + merlin.getCharacterSuperPower());




    }
}
