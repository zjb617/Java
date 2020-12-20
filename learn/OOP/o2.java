package OOP;
public class o2 {
    public static void main(String[] args) {
        Person2 p = new Person2();
        int n = 15;//n 的值为15
        p.setAge(n); //传入n的值
        System.out.println(p.getAge()); //15
        n = 20; //n的值改为20
        System.out.println(p.getAge()); //15 or 20？
    }
}

class Person2 {
    private int age;
    
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}