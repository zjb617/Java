package OOP;
public class PrivateField {
    public static void main(String[] args) {
        Person1 ming = new Person1();
        ming.setName("Xiao Ming"); // 设置name
        ming.setAge(12); // 设置age
        System.out.println(ming.getName() + "," + ming.getAge());
    }
}

class Person1 {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Invalid age value");
        }
        this.age = age;
    }
}
