package cn.tedu.oop;

/*本类用于描述学生这一类事物*/
public class Student {
    //1.定义学生的属性
    private int id;//学号
    private String name;//姓名
    private char gender;//性别
    private String address;//住址
    private String subject;//科目

    public Student() {
        System.out.println("我是Student类的无参构造");
    }

    public Student(int id, String name, char gender, String address, String subject) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.subject = subject;
        System.out.println("我是Student类的全参构造");
    }

    public void study() {
        System.out.println("学习使我快乐~");
    }

    public void eat(int n) {
        System.out.println("今天我要干它" + n + "碗大米饭");
    }

    public String sleep() {
        return  "今天又睡了美美的一觉";
    }

    public void show() {
        System.out.println("Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", subject='" + subject + '\'' +
                '}');
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
