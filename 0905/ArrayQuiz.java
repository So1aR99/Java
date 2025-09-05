import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("영어, 국어, 수학 순으로 점수를 입력하세요");
        System.out.println("-----------------------------------");

        int[] score = new int[3];
        for (int i=0; i<score.length; i++){
            score[i] = sc.nextInt();
        }

        int sum = score[0] + score[1] + score[2];
        double avg = sum / 3.0;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
