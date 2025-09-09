import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("이순신", 85);
        map.put("홍길동", 90); // 없어짐
        map.put("강장군", 80);
        map.put("홍길동", 95); // 키값이 홍길동으로 동일한 Entry는 나중에 입력된 Entry로 저장

        // Key정렬이 필요하다면 TreeMap으로 바꾸자
        Map<String, Integer> sortedMap = new TreeMap<>(map);    // TreeMap으로 변환 -> key나 value로 정렬가능
        for(Map.Entry<String, Integer> e : sortedMap.entrySet()) {
            System.out.println("\t" + e.getKey() + " : " + e.getValue());
        }
    }
}
