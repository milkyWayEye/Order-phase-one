package cn.tedu.api;

import java.util.Objects;

/*本类用于顶级父类Object的入门案例*/
public class TestObject {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("海绵宝宝",3);
        Student s2 = new Student("海绵宝宝",3);

        /*本方法的作用是返回对应对象的int类型的哈希码值
        * 本方法力求不同的对象返回的哈希码不同
        * 这样我们就可以根据哈希值区分不同的对象*/
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        /*Object中toString()的默认实现:对象的名字@十六进制哈希码值
        * 子类重写了toString()以后:打印的是对象的类型+属性+属性值*/
        System.out.println(s);
        System.out.println(s1);

        /*Object中equals()的默认实现使用的是==比较
        * ==比较的是左右两边的值,如果是基本类型,比较的是字面值,
        * 如果是引用类型,比较的是引用类型变量保存的地址值*/
        System.out.println(s1.equals(s2));
    }
}

class Student {
    String name;
    int age;

    public Student(String naem, int age) {
        this.name = naem;
        this.age = age;
        System.out.println("含参构造");
    }

    public Student() {
        System.out.println("无参构造");
    }

    @Override
    public String toString() {
        return "Student{" +
                "naem='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*equals()与hashCode()逻辑要保持一致,要重写都重写,要不重写都不重写
    * 如果不重写:hashCode()的哈希码根据地址值生成
    *           equals()底层使用==比较两个对象的地址值
    * 如果重写了:hashCode()的哈希码根据重写传入的属性值生成
    *           equals()比较的是重写后类型+所有属性与属性值*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        /*多态:向上造型:把子类看作是父类型 Animal a = new Cat();
        *     向下造型:之前转成父类型的子
        *     类对象,又想使用子类自己的特
        *     有功能了,可以向下转型       Cat c = (Cat) a*/
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
