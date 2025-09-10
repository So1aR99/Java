import java.util.Arrays;
import java.util.List;

class Student {
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
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("이순신", 20),
                new Student("강감찬", 30)
        );
        // 총점, 평균을 구해보지
        double avg = list.stream().mapToInt(Student :: getScore).average().getAsDouble();

        System.out.println("평균값 : " + avg);
    }
}
