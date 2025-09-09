import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//유용한 유틸리티 클래스
//Collections, Arrays

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "강감찬", "이순신");
                            // Arrays
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + "\t");
        }

        System.out.println();

        Collections.sort(list);     // 정렬
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + "\t");
        }

        System.out.println();

        int[] arr = {5, 2, 1, 4, 3};
        Arrays.sort(arr);       // 정렬
        for(int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
