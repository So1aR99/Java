// 객체의 설계도
class Car
{
    // 1. 멤버 변수
    String brand;
    int speed;
    String color;
    // 2. 생성자
    Car(){  // 디폴트 생성자

    }
    Car(String brand){
        this.brand =  brand;
    }
    Car(int speed, String brand){
        this.speed = speed;
        this.brand = brand;
    }
    // 3. 멤버 메소드
    public void Run(){
        System.out.println("차가 달린다~!!!");
    }
}
public class Main {
    public static void main(String[] args) {
        Car dori = new Car();
        dori.Run();
        System.out.println("자동차 브랜드 : " + dori.brand);
        Car myCar = new Car(100, "BMW");
        myCar.Run();
        System.out.println("자동차 스피드 : " + myCar.speed);
        System.out.println("자동차 브랜드 : " + myCar.brand);
    }
}
