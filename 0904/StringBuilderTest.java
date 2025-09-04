class A {

}

public class Main extends Object {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("JAVA ");
        sb.append("Program Study");

        System.out.println(sb);
        System.out.println(sb.toString());

//        A a = new A();
//        System.out.println(a);
//        System.out.println(a.toString());
        sb.insert(4,"2");
        System.out.println(sb);

        sb.setCharAt(4, '6');
        System.out.println(sb);

        sb.replace(6, 13, "Book");
        System.out.println(sb);

        sb.delete(4, 5);
        System.out.println(sb);

        int length = sb.length();
        System.out.println("총 문자수 : " + length);

        String result = sb.toString();
        System.out.println(result);
    }
}
