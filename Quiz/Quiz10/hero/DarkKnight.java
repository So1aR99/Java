package com.google.hero;

public class DarkKnight extends Knight {
    public DarkKnight(){
        this.name = "다크 나이트";
        this.level = 25;
        this.hp = 400;
        this.mp = 100;
    }
    @Override
    public void attack() {
        System.out.println("어둠의 칼을 휘두른다!!");
    }
}

