public class Main {
    public static void main(String[] args) {
        int a = 100;        // Type(자료형) - int
        Integer obj = 200;  // Boxing(박싱), Type(자료형) - class Integer -> Wrapper(int)

        a = obj;    // UnBoxing(자동 언박싱) 너무나 많이 사용되어서 Java에서 특별히 되도록 만든 구조
        System.out.println(a);

        Integer obj2 = 300; // 박싱
        int b = obj2;   // 언박싱
        System.out.println(b);

        Integer obj3 = 500;
        Integer obj4 = 500;
        System.out.println("레퍼런스가 가지고 있는 주소값 비교 : " + (obj3 == obj4));
        System.out.println("최종값이 같은지 여부 : " + obj3.equals(obj4));
    }
}
// 박싱 : 기본 타입 값을 포장 객체로 만드는 과정. 포장 클래스 변수에 기본 타입 값이 대입 시 발생
// 언박싱 : 포장 객체에서 기본 타입 값을 얻어내는 과정. 기본 타입 변수에 포장 객체가 대입 시 발생
