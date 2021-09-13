package cn.tedu.oop;

/**
 * 定义一个小狗类Dog 属性：姓名name 年龄age 品种kind 主人host
 * 价格price
 * 功能：跑run 吃eat 睡觉sleep 玩play
 * 要求： 1.创建所有的属性，并进行封装
 * 2.创建本类的无参构造、含参构造(int n)、全参构造
 * 3.利用3种不同构造方法创建三个对象d1 d2 d3
 * 4.通过创建好的每一个对象，查看所有的属性，并调用所有的方法
 */
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog(2);
        Dog d3 = new Dog("大黄", 3, "中华田园犬", "小明", 3000.99);
        //d1
        d1.setName("小白");
        d1.setAge(2);
        d1.setKind("贵宾犬");
        d1.setHost("小红");
        d1.setPrice(2989.53);
        System.out.println(String.format("%s是%s花了%f买的一条%d岁的%s", d1.getName(),
                d1.getHost(), d1.getPrice(), d1.getAge(), d1.getKind()));
        d1.run();
        d1.eat();
        d1.sleep();
        d1.play();
        //d2
        d2.setName("大黑");
        d2.setAge(4);
        d2.setKind("藏獒");
        d2.setHost("小军");
        d2.setPrice(3256.98);
        System.out.println(String.format("%s是%s花了%f买的一条%d岁的%s", d2.getName(),
                d2.getHost(), d2.getPrice(), d2.getAge(), d2.getKind()));
        d2.run();
        d2.eat();
        d2.sleep();
        d2.play();
        //d3
        System.out.println(String.format("%s是%s花了%f买的一条%d岁的%s", d3.getName(),
                d3.getHost(), d3.getPrice(), d3.getAge(), d3.getKind()));
        d3.run();
        d3.eat();
        d3.sleep();
        d3.play();
    }
}

class Dog {
    private String name;
    private int age;
    private String kind;
    private String host;
    private double price;

    public Dog() {
        System.out.println("我是Dog类的无参构造");
    }

    public Dog(int n) {
        System.out.println("我是Dog类的含参构造" + n);
    }

    public Dog(String name, int age, String kind, String host, double price) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.host = host;
        this.price = price;
        System.out.println("我是Dog类的全参构造");
    }

    public void run() {
        System.out.println("跑");
    }

    public void eat() {
        System.out.println("吃东西");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void play() {
        System.out.println("玩");
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
