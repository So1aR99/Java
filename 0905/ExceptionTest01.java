public class Main {
    public static void main(String[] args) {

        try {
            Class clazz = Class.forName("java.lang.Math8");
            System.out.println("정상 수행 되었습니다.");

        }catch (ClassNotFoundException ex) {
            System.out.println("클래스를 찾지 못해 예외가 발생하였습니다.");

        }catch (Exception e) {
            System.out.println("예외가 발생하였습니다.");

        }finally {
            System.out.println("무조건 실행되는 영역");
        }
    }
}
