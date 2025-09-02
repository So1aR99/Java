class Phone{
    public String model;
    public String color;
    public Phone(){
        System.out.println("Phone() 생성자가 실행!");
        model = "핸드폰";
        color = "검은색";
    }
    public void run(){
        System.out.println("핸드폰이 동작한다.");
    }
}
class SmartPhone extends Phone{
    public SmartPhone(){
        System.out.println("SmartPhone() 생성자 실행!");
        this.model = "삼성";
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        System.out.println(myPhone.model);
        System.out.println(myPhone.color);
        myPhone.run();
    }
}
