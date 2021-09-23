package cn.tedu.reflection;
/*本类用作测试反射的物料类,假装这是别人写的代码
* 反射的前提:获取字节码对象,因为字节码对象中有这个类所有的关键信息*/
public class Student {
    //1.定义本类的成员变量
    private String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(int n) {
        System.out.printf("今天要吃%d碗大米饭",n);
    }
}
