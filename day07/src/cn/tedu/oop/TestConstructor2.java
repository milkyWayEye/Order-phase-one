package cn.tedu.oop;
/*本类用于构造函数的巩固练习*/
public class TestConstructor2 {
    public static void main(String[] args) {
        Pet p = new Pet(2);
        System.out.println(p.age+p.host+p.name);
        Pet p1 = new Pet("dskf","都是付款",1);
        System.out.println(p1.age+p1.host+p1.name);
    }
}

class Pet {
    String name;
    String host;
    int age;

    public Pet(int n) {
        System.out.println("我是Pet类的含参构造"+n);
    }

    public Pet(String name, String host, int age) {
        this.name = name;
        this.host = host;
        this.age = age;
    }
}