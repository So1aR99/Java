public class Main {
    public static void main(String[] args) {

        Cat ruby = new Cat("루비", 2, "검은색");
        ruby.setName("루비 고양이");
        System.out.println(ruby.getName()); // 간접 접근

        ruby.Meow();;
        ruby.Eat();
    }
}
