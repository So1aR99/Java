// 제너릭 문법 이해를 위한 사전 클래스
class Box {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }
    public Object get() {
        return object;
    }
}
class Apple {}

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.set("홍길동");
        String name = (String)box.get();
        System.out.println(name);

//        Apple apple = new Apple();
//        box.set(apple);
        box.set(new Apple());
        Apple apple2 = (Apple)box.get();
    }
}

-----------------------------------------------
// 제너릭 클래스 만들어서 테스트
  class Box<T>{
    private T t;
    public T get() {
        return  t;
    }
    public void set(T t ) {
        this.t = t;
    }
}
class Apple {}

public class Main {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();
        box1.set("홍길동");
        String name = box1.get();
        System.out.println(name);

        Box<Apple> box2 = new Box<Apple>();
        Apple apple = new Apple();
        box2.set(apple);
        Apple apple2 = box2.get();  // 가능
    }
}
