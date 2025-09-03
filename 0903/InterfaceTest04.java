class RemoteControl{
}
public class Main {
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl(){
            public void turnOn(){
                System.out.println("전원을 켜다");
            }
            public void turnOff(){
                System.out.println("전원을 끄다.");
            }
        };
        
    }
}
