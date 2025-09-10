import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

// 객체간 비교를 위해서는 Comparable 인터페이스를 구현
class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    // 객체간의 비교는 기준을 만들어줘야 함
    @Override
    public int compareTo(Student s) {
        return Integer.compare(score, s.score);
    }   // 음수 : 작은 값, 0 : 같다, 양수 : 큰 값
}

public class Main {
    public static void main(String[] args) {
        IntStream stream = Arrays.stream(new int[] {5,3,4,1,2});

        stream.sorted().forEach( i -> System.out.print(i + " "));    // 정렬
        System.out.println();

        List<Student> list = Arrays.asList(
                new Student("홍길동", 50),
                new Student("이순신", 100),
                new Student("강감찬", 90)
        );
        // 오름차순
        list.stream().sorted().forEach(s -> {
            System.out.println(s.getName() + "/" + s.getScore());
        });
        // 내림차순
        list.stream().sorted(Comparator.reverseOrder()).forEach(s -> {
            System.out.println(s.getName() + "/" + s.getScore());
        });
    }
}
