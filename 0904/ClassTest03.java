// 바깥 필드와 메소드에서 사용 제한
class A {
    // Instance 멤버 변수
    B field1 = new B();
    C field2 = new C();

    // Instance 메소드
    void method() {
        B var1 = new B();
        C var2 = new C();
    }
    // static 멤버 변수 초가화
    // static B field3 = new B(); ( x ) Error
    static C field4 = new C();

    // static 메소드
    static void method2() {
        //B var1 = new B(); ( x ) Error, Instance 멤버 클래스의 메소드 사용불가
        C var2 = new C(); // static 메소드에 static 클래스 생성 가능
    }

//    A() {
//        field1 = new B();
//        field2 = new C();
//    }


    // Instance 멤버 클래스
    class B {
    }
    // static(정적) 멤버 클래스
    static class C {
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
