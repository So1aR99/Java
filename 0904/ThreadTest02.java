class AlphaThread extends Thread {
    @Override
    public void run() {
        // 'A' ~ 'Z', 'a' ~ 'z'
        for(int i='A'; i<='Z'; i++)
            System.out.println((char)i);
        for(int i='a'; i<='z'; i++)
            System.out.println((char)i);
    }
}
class NumberThread implements Runnable {
    @Override
    public void run() {
        // 1 ~ 10000
        for(int i=0; i<=10000; i++)
            System.out.println(i);
    }
}

public class Main {
    public static void main(String[] args) {
        // 상속으로 만들어진 스레드 클래스
        AlphaThread at = new AlphaThread();
        at.start();

        // Runnable로 구현받아 처리하는 스레드 클래스
        NumberThread nt = new NumberThread();
        Thread t = new Thread(nt);
        t.start();
    }
}
