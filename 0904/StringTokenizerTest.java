import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String text = "홍길동/강호동/유재석";

        StringTokenizer st = new StringTokenizer(text, ",/ ");

        int countTokens = st.countTokens();

        for(int i=0; i<countTokens; i++){
            String token = st.nextToken();
            System.out.println(token);
        }
        System.out.println();
        
        st = new StringTokenizer(text, "/");
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);

        }
    }
}
