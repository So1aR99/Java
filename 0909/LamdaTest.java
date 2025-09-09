class WorkThread implements Runnable {
    @Override
    public void run() {
        // 1 ~ 100까지 출력
        for(int i=1; i<=100; i++)
            System.out.println(i);
    }
}
public class Main {
    public static void main(String[] args) {
        WorkThread wt = new WorkThread();
        Thread t = new Thread(wt);
        t.start();

        // 람다 스타일
        Thread t2 = new Thread(() -> {
          for(int i=1; i<=100; i++)
              System.out.println(i);
        });
    }
}
