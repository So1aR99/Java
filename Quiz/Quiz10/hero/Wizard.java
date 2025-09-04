package com.google.hero;

public class Wizard extends Hero{
    public Wizard() {
        this.name = "마법사";
        this.level = 30;
        this.hp = 150;
        this.mp = 500;
    }
    @Override
    public void attack() {
        System.out.println("마법을 사용한다!!");
    }
}
