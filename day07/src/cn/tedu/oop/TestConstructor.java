package cn.tedu.oop;

/**
 * 本类用于测试构造方法
 */
public class TestConstructor {
    public static void main(String[] args) {
        /*1.每次new(实例化)对象时,都会自动触发对应类的构造方法*/
        /*2.每一个类都会默认存在一个没有参数的构造方法
        * 但是,如果你提供了其他的构造函数,默认的无参构造会被覆盖
        * 所以,我们要手动的提供无参构造,这样才能不传参数,也能创建对象*/
        Person p = new Person();
        p.eat();
        /*4.每次创建对象时,都会执行构造方法
        * 构造方法的作用:用来创建对象的*/
        Person p1 = new Person("泡泡",25,"北京");
        p1.eat();
    }
}

class Person {
    String name;
    int age;
    String address;
    /*3.构造方法的格式:没有返回值类型并且与类名相同的方法*/
    public Person() {
        System.out.println("我是Person类的无参构造");
    }
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void eat() {
        System.out.println(name+"干饭不积极,思想有问题~");
    }
}