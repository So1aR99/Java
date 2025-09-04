abstract class Manmal {
    abstract public void eat(); // 자식 클래스에 강제로 구현하게 만든다.
}
interface Flyable {
    void fly();
}
interface Runnable {
    void run(); // public static 생략되어 있다!!
}
class A {
}
class Lion extends Manmal implements Flyable, Runnable {
    @Override
    public void eat() {     // abstract method는 강제 구현되어야 한다.
    }
    @Override
    public void fly() {     // interface method도 abstract method처럼 강제 구현 된다!!
    }
    @Override
    public void run() {
    }
}
class Tiger extends Manmal implements Flyable, Runnable {
    @Override
    public void eat() {
    }
    @Override
    public void fly() {
    }
    @Override
    public void run() {
    }
}
public class Main {
    public static void main(String[] args) {
    }
}
