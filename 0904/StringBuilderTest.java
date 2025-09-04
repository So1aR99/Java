class A {

}

public class Main extends Object {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("JAVA ");
        sb.append("Programming");

        System.out.println(sb);
        System.out.println(sb.toString());

        A a = new A();
        System.out.println(a);
        System.out.println(a.toString());
    }
}
