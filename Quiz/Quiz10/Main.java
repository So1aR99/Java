package com.google.base;

import com.google.hero.DarkKnight;
import com.google.hero.Knight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Story story = new Story();
        story.initStoryWrite();

        Knight kn = new Knight();
        System.out.println(kn.getName());
        System.out.println();
        System.out.println("적이 등장했다!!!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        kn.attack();
        System.out.println("적이 쓰러지고 어둠의 기사로 전직할 수 있게 되었다!!");

        int a = 0;
        while (true){
            System.out.println("전직하려면 (1), 안하려면 (2) 누르세요.");
            try {
                a = sc.nextInt();
                if(a == 1 || a == 2) {
                    break;
                }else {
                    System.out.println("숫자를 다시 입력하세요.");
                }
            }catch (InputMismatchException e) {
                System.out.println("유효한 숫자를 입력하세요.");
                sc.next();
            }
        }

        if(a == 1){
            DarkKnight dk = new DarkKnight();
            System.out.println(dk.getName());
            System.out.println();
            System.out.println("  당신의 프로필");
            System.out.println("----------------");
            System.out.println("직업 : " + dk.getName());
            System.out.println("레벨 : " + dk.getLevel());
            System.out.println("체력 : " + dk.getHp());
            System.out.println("마나 : " + dk.getMp());
        }
        else {
            System.out.println(kn.getName());
            System.out.println();
            System.out.println("  당신의 프로필");
            System.out.println("----------------");
            System.out.println("직업 : " + kn.getName());
            System.out.println("레벨 : " + kn.getLevel());
            System.out.println("체력 : " + kn.getHp());
            System.out.println("마나 : " + kn.getMp());
        }
    }
}
