public class Cat {

    private String name;
    private int age;
    private String color;

    public Cat(){
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void Meow(){
        System.out.println("야옹 야옹");
    }
    public void Eat(){
        System.out.println("냠냠");
    }

    // 직접 접근, 간접 접근
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

}
