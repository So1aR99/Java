public class Main {
    public static void main(String[] args) {
        Car a = new Car();

        System.out.println("차의 색 : " + a.color);
        System.out.println("문의 개수 : " + a.door);
        System.out.println("바퀴 개수 : " + a.wheel);

        System.out.println(a.Start());

        Car b = new Car(4);
        System.out.println("차의 색 : " + b.color);
        System.out.println("문의 개수 : " + b.door);
        System.out.println("바퀴 개수 : " + b.wheel);

        System.out.println(b.Open());

        Car c = new Car("하얀색", 6, 8);
        System.out.println("차의 색 : " + c.color);
        System.out.println("문의 개수 : " + c.door);
        System.out.println("바퀴 개수 : " + c.wheel);

        System.out.println(c.Stop());
    }
}
