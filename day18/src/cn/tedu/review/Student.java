package cn.tedu.review;
/*本类用于复习反射的物料类*/
public class Student {
    private  String name;
    public int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //提供本类的普通方法
    public void play(){
        System.out.println("大结局");
    }
    public void sunDay(int n) {
        System.out.println("国庆放"+n+"天");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
