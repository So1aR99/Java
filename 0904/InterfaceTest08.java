interface InterfaceA {
    void methodA();
}
interface InterfaceB {
    void methodB();
}
interface InterfaceC extends InterfaceA, InterfaceB {
}
class Test implements InterfaceC {
    @Override
    public void methodA() {
    }
    @Override
    public void methodB() {
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
