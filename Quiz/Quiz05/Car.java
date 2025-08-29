public class Car {
    String color;   // 색깔
    int door;   // 문 수
    int wheel;  // 바퀴 수

    Car()
    {
        this.color = "파란색";
        this.door = 2;
        this.wheel = 4;
    }
    Car(int door)
    {
        this.color = "노란색";
        this.door = 4;
        this.wheel = 6;
    }
    Car(String color, int door, int wheel)
    {
        this.color = color;
        this.door = door;
        this.wheel = wheel;
    }
    String Start(){
        return "차가 출발합니다!";
    }

    String Stop(){
        return "차가 멈춥니다!";
    }

    String Open(){
        return "문이 열립니다!";
    }
}

