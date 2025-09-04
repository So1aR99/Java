class A {
    class B {           // 중첩 클래스 ( O )
    }
    interface C {       // 중첩 인터페이스 ( O )
    }
}
class View {
    public interface OnClickListener {
        public void onClick(View v);
    }
}
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        A a = new A();
        View view = new View();
    }
}
