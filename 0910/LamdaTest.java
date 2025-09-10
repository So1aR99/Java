interface MyInterface {
    public int runMethod(int x, int y);
}
public class Main {
    public static void main(String[] args) {
        MyInterface mi;

        mi = (x, y) -> {
            int result = x * y;
            return result;
        };
        System.out.println(mi.runMethod(2,3));

        mi = (x, y) -> { return x * y; };
        System.out.println(mi.runMethod(3, 4));

        mi = (x, y) -> x * y;
        System.out.println(mi.runMethod(4,5));

        mi = (x, y) -> mul(x, y);
        System.out.println(mi.runMethod(5, 6));

    }  // end of Main
    static int mul(int x, int y) {
        return x * y;
    }
}
