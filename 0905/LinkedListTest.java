import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("대전");
        list.add("세종");
        list.add("서울");

        for(String s : list)
            System.out.println(s);
    }
}
