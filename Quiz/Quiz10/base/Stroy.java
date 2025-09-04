package com.google.base;

public class Story {
    private void typeWriter(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
    public void initStoryWrite() {
        typeWriter("때는 B.C 500년 어둠이 내리고 악이 판치는 곳이다.", 50);
        typeWriter("어둠이 내린 시기에 영웅이 등장해 이겨내리라.", 50);
        typeWriter("이제 영웅이 등장할 시기이니..", 50);
        System.out.println();
        typeWriter("당신 영웅의 이름은 무엇인가? ", 50);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
