import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Boxing
        int num = 10;
        Integer boxedNum = Integer.valueOf(num);  // 명시적 Boxing
        Integer autoBoxingNum1 = num;  // auto Boxing

        // UnBoxing
        Integer obj = Integer.valueOf(20);
        int unboxNum = obj.intValue();  // 명시적 UnBoxing
        int autoUnboxNum = obj;  // auto UnBoxing

        // 사용 이유, 제너릭 클래스만 사용, c++
        ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<int> Error 제너릭은 클래스 타입만 들어감
        list.add(5);    // auto boxing
        list.add(10);   // auto boxing
        int value = list.get(0);    // auto unboxing
    }
}
