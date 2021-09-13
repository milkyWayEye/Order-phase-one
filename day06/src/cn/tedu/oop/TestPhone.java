package cn.tedu.oop;
/**本类用作面向对象的入门案例
 * 用来设计手机这一类事物
 * */
/*1.在同一个Java文件中,可以定义多个class,但是被public修饰的公共类只能有一个,
* 并且要求这个公共类的名字就是当前java文件的名字 */
public class TestPhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call();
        p.message();
        p.video();
        System.out.println(p.brand);
        System.out.println(p.color);
        System.out.println(p.price);
        System.out.println(p.size);
        Phone p2 = new Phone();
        p2.brand = "HUAWEI";
        p2.color = "五彩斑斓的黑";
        p2.price = 8888.88;
        p2.size = 5.6;
        System.out.println(p2.brand);
        System.out.println(p2.color);
        System.out.println(p2.price);
        System.out.println(p2.size);
    }
}

//1.通过clss关键字创建手机类--用来描述手机这一类事物
class Phone {
    String brand;
    double price;
    String color;
    double size;

    public void call() {
        System.out.println("正在打电话~");
    }
    public void message() {
        System.out.println("正在发短信!");
    }
    public void video() {
        System.out.println("正在看直播~~~");
    }
}