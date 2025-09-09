import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(98);
        scores.add(87);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        Integer value = null;

        value = scores.first();
        System.out.println(value);      // 가장 왼쪽에 있는 값

        System.out.println(scores.last());  // 가장 큰값

        System.out.println(scores.lower(95));   // 각 단계보다 작은 값, 95에서 바로 작은 값

        System.out.println(scores.higher(75));  // 각 단계보다 큰 값, 75에서 바로 큰 값
        System.out.println();
        System.out.println();

        Iterator<Integer> iter = scores.iterator();

        while (iter.hasNext()) {    // 자료가 있다면
            int s = iter.next();    // 한 칸 전진
            System.out.println(s);
        }
    }
}
------------------------------------------------------------
75
98
87
80


75
80
87
95
98
