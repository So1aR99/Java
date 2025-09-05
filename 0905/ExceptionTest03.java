public class Main {
    public static void findClass1() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.Math6");
    }
    public static void findClass2() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.Math6");
    }

    public static void main(String[] args) {
        try {
            findClass1();
            findClass2();

        } catch (ClassNotFoundException e) {
            System.out.println("클래스를 찾지 못하는 예외가 발생하였습니다.");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
