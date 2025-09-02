class Car{
    private String brand;
    private int speed;
    private String color;

    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public int getSpeed() { return speed; }

    public void setSpeed(int speed) { this.speed = speed; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }
}

public class Main {
    public static void main(String[] args) {
        Car MyCar = new Car();
        MyCar.setBrand("기아");
        MyCar.setSpeed(200);
        MyCar.setColor("검은색");

        System.out.println("브랜드 : " + MyCar.getBrand());
        System.out.println("최고속도 : " + MyCar.getSpeed());
        System.out.println("색상 : " + MyCar.getColor());
    }
}
