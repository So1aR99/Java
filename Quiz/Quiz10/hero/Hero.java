package com.google.hero;

public class Hero {
    protected String name;
    protected int level;
    protected int hp;
    protected int mp;

    public Hero(){
        this.name = "히어로";
        this.level = 1;
        this.hp = 100;
        this.mp = 10;
    }
    public void attack(){
        System.out.println("맨 주먹을 휘두른다!!");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getLevel(){
        return level;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public int getMp(){
        return mp;
    }
    public void setMp(int mp){
        this.mp = mp;
    }
}
