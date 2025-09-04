package com.google.hero;

public class Knight extends Hero {
    public Knight() {
        this.name = "기사";
        this.level = 20;
        this.hp = 300;
        this.mp = 50;
    }
    @Override
    public void attack() {
        System.out.println("칼을 휘두른다!!");
    }
}
