package OOP;
public class o3 {
    public static void main(String[] args) {
        Person3 p = new Person3();
        String[] fullname = new String[] { "Homer", "Simpson" };
        p.setName(fullname); // 传入fullname数组
        System.out.println(p.getName()); // "Homer Simpson"
        fullname[0] = "Bart"; // fullname数组的第一个元素怒修改为"Bart"
        System.out.println(p.getName()); // "Homer Simpson" 还是 "Bart Simpson"?
    }
}

class Person3 {
    private String[] name;

    public String getName() {
        return this.name[0] + " " + this.name[1];
    }

    public void setName(String[] name) {
        this.name = name;
    }
}