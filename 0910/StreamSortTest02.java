import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

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

    // 원래대로 점수 기준 정렬
    @Override
    public int compareTo(Student s) {
        return Integer.compare(score, s.score);
    }
}

public class Main {
    public static void main(String[] args) {
        IntStream stream = Arrays.stream(new int[] {5,3,4,1,2});
        stream.sorted().forEach(i -> System.out.print(i + " "));
        System.out.println();

        List<Student> list = Arrays.asList(
            new Student("홍길동", 50),
            new Student("이순신", 100),
            new Student("강감찬", 90)
        );

        // 이름 기준 오름차순 정렬
        System.out.println("이름 오름차순 정렬:");
        list.stream()
            .sorted(Comparator.comparing(Student::getName))
            .forEach(s -> System.out.println(s.getName() + "/" + s.getScore()));

        // 이름 기준 내림차순 정렬.
        System.out.println("이름 내림차순 정렬:");
        list.stream()
            .sorted(Comparator.comparing(Student::getName).reversed())
            .forEach(s -> System.out.println(s.getName() + "/" + s.getScore()));
    }
}
