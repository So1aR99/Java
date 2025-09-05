public class Main {
    public static void main(String[] args) {
        String str = "안녕하세요";
        //int a = 100;
        //Object obj = new Object();

        byte[] bytes1 = str.getBytes(); // 문자열을 byte로 변환하여 byte배열에 담았다.
        System.out.println("bytes1.length : " + bytes1.length);
        String str1 = new String(bytes1);   // String 생성자를 통해서 bytes -> String
        System.out.println("bytes1 -> String : " + str1);
    }
}
