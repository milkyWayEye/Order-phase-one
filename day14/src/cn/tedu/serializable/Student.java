package cn.tedu.serializable;

import java.io.Serializable;
import java.util.Objects;

/*本类用于序列化测试的物料类*/
/*反序列化时的UID必须与序列化时输出到文件中的UID保持一致,如果不一样,反序列化会失败
* 所以我们通常的操作是:一次序列化对应一次反序列化,这样就不会报错了
* 注意:如果一次序列化之后,Strudent类并没有做更改,那么多次序列化也没有问题
* 只要Student发生改动,UID的值就会改变*/
public class Student implements Serializable{
//    //如果不想让UID随着类的改变而改变,那么我们可以把它设置成一个固定值
//    private static final long serialVersionUID = 1L;
    //定义学生相关的属性,并进行封装
    private String name;
    private int age;
    private String addr;//住址
    private char gender;//性别

    public Student() {
        System.out.println("我是Student类的无参构造");
    }

    public Student(String name, int age, String addr, char gender) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.gender = gender;
        System.out.println("我是Student类的全参构造");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, addr, gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr='" + addr + '\'' +
                ", gender=" + gender +
                '}';
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
