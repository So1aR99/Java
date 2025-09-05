import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 분할 정복 방식 -> 업무를 쪼개어서 3단계

        // 1. 변수선언, 입력부
        int[] score = new int[3];;
        int total = 0;  // 0으로 초기화 시켜야 되는 변수 카운터, 합
        double avg;
        // 1.5입력부
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            score[i] = sc.nextInt();
            total += score[i];
        }
        // 2. 수식
        avg = (double)total / 3.0;
        // 3. 출력
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f", avg);

        //Scanner sc = new Scanner(System.in);
//        System.out.println("영어, 국어, 수학 순으로 점수를 입력하세요");
//        System.out.println("-----------------------------------");
//
//        int[] score = new int[3];
//        for (int i=0; i<score.length; i++){
//            score[i] = sc.nextInt();
//        }
//
//        int sum = score[0] + score[1] + score[2];
//        double avg = sum / 3.0;
//        System.out.println("총점 : " + sum);
//        System.out.println("평균 : " + avg);
    }
}
