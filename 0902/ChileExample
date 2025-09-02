class Parent{
    public String filed1;

    public void method1(){
        System.out.println("Parent-method1()");
    }
    public void method2(){
        System.out.println("Parent-method2()");
    }
}
class Child extends Parent{
    public String filed2;

    public void method3(){
        System.out.println("Parent-method3()");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();    // 되는 문법, 부모클래스 레퍼런스 자식 생성!

        parent.filed1 = "data1";
        parent.method1();
        parent.method2();

        //parent.filed2 = "data2"; 불가능!
        //parent.method3(); 불가능!

        // 강제 타입 변환
        Child child = (Child)parent;    // 강제형 변환, Down_Casting
        child.filed2 = "data2";
        child.method3();
    }
}
