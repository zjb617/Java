package OOP;
public class o4 {
    public static void main(String[] args) {
        System.out.println("test!!");
    }
}

class Person4 {
    private String[] name;

    public String getName() {
        return this.name[0] + " " + this.name[1];
    }

    public void setName(String[] name) {
        this.name = name;
    }
}

class Student extends Person4 {
    //不要重复
    //只需定义新增的字段和方法
    private int score;

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
    }
}