public class Main {
    public static void myPrint() {
        System.out.println("Hello World!");
    }
    public void myPrint2() {        // static 없으면 캡슐
        System.out.println("Hello World! Print2");
    }
    public String func1() {            // void가 아니면 무조건 return 값이 있어야함
        System.out.println("fucn1");
        return "반갑습니다.";
    }
    public int func2(int value) {
        System.out.println("func2");
        return value + 1;
    }

    public static void main(String[] args) {
        myPrint();
        Main m = new Main();
        m.myPrint2();
        m.func1();
        String s = m.func1();
        System.out.println(s);
        m.func2(7);
        int result1 = m.func2(7);
        System.out.println(result1);
    }
}
