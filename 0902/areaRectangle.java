class Calculator
{
    // 정사각형의 넓이
    double areaRectangle(double width){
        return  width * width;
    }
    // 직사각형의 넓이
    double areaRectangle(double width, double height) {
        return  width * height;
    }
    public int plus(int a, int b){
        return  a + b;
    }
    public int minus(int a , int b){
        return  a - b;
    }
    public int multiple(int a, int b){
        return  a * b;
    }
    public double divide(int a, int b){
        return (double)a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();
        int width = 10;
        int height = 20;

        // 정사각형의 넓이
        System.out.println("정사각형의 넓이 : " + myCal.areaRectangle(width));
        // 직사각형의 넓이
        System.out.println("직사각형의 넓이 : " + myCal.areaRectangle(width, height));

    }
}
