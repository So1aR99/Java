import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] score;
        score = new int[3];

        System.out.println("성적 입력");

        for(int i=0; i<score.length; i++){
            score[i] = sc.nextInt();
        }
        int sum = score[0] + score[1] + score[2];
        System.out.println("총점 : " + sum);

        double average = sum / 3.0;
        System.out.printf("평균 : %.2f", average);


    }
}
