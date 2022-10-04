package org.example;

import game.hero.Elf4;

public class Main {
    public static void main(String[] args) {

        Elf4 heroElf4 = new game.hero.Elf4(1, "Boris");

        System.out.println(heroElf4.getId());
        System.out.println(heroElf4.getNickname());

        heroElf4.setNickname("Borya");
        System.out.println(heroElf4.getNickname());

    }
}