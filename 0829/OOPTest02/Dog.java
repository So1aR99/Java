public class Dog {
    // 1. 멤버 변수
    String name;
    int age;
    String color;
    // 2. 생성자 - 객체 초기화
    Dog()
    {
        this.name = "강아지";
        this.age = 3;
        this.color = "누런색";
    }
    Dog(String name)
    {
        this.name = name;
        //this.color = "누런색";

    }
    Dog(int age ,String name, String color)
    {
        this.age = age;
        this.name = name;
        this.color = color;
    }
    // 3. 멤버 메소드
    String Run(){
        return "달리다~~!!!";
    }
    String Eat(){
        return "먹다~!!!!";
    }
    String Bark(){
        return "멍멍";
    }
}
