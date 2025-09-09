import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            return member.name.equals(name) && (member.age == age);
        } else return false;
    }

    @Override
    public int hashCode() {
        /* return name.hashCode() + age; */
        return Objects.hash(name, age);
    }
}
public class Main {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<Member>();

        set.add(new Member("홍길동", 30)); // A객체
        set.add(new Member("홍길동", 30)); // B객체
        /* A와 B는 분명 다른 객체이지만, 논리적으로 동등한 객체이다(동등객체).
           Set은 암시적으로 동등객체도 제외하고 저장한다. */

        System.out.println("총 객체 수: " + set.size());
    }
}
