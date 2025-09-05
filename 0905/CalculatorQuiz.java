import java.util.Scanner;

class Calculator {
    int plus(int a, int b) {
        return a + b;
    }
    int minus(int a, int b) {
        return a - b;
    }
    int mul(int a, int b) {
        return a * b;
    }
    double div(int a, int b) {
        return (double)a / b;
    }

}
public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.println("-------------------------");

        System.out.println("+ 결과 값 : " + cal.plus(a, b));
        System.out.println("- 결과 값 : " + cal.minus(a, b));
        System.out.println("* 결과 값 : " + cal.mul(a, b));
        System.out.printf("/ 결과 값 : %.2f", cal.div(a, b));
    }
}
