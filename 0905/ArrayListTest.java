import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //ArrayList<String> fruits = new ArrayList<>();
        List<String> fruits = new ArrayList<>();

        fruits.add("수박");
        fruits.add("사과");
        fruits.add("참외");
        fruits.add("메론");
        fruits.add("복숭아");
        fruits.add("바나나");

        fruits.remove("메론");

        for(String item : fruits){
            System.out.println(item);
        }
    }
}
