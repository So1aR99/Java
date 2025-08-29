
class Car{
    // 1. 멤버변수
    String brand;
    int speed;
    String color;
    // 2. 생성자
    Car(){  // default 생성자
    }

    Car(String brand, int speed, String color){ // 인자, 매개변수, 파라미터 등이 있는 생성자
        this.brand = brand;
        this.speed = speed;
        this.color = color;
    }
    // 3. 멤버 메소드
    public void Run(){
        System.out.println("차가 달린다!!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar1 = new Car(); // default 생성자로 객체 생성
        System.out.println(myCar1.speed);   // 0
        Car myCar2 = new Car("현대", 240, "하얀색");
        System.out.println(myCar2.speed);   // 240
    }
}
