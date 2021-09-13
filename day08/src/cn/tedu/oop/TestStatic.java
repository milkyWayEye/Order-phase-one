package cn.tedu.oop;
/*本类用于测试静态关键字static*/
public class TestStatic {
    public static void main(String[] args) {
        /*静态资源在内存中只有一份,被全局所有对象共享
        * 所以我们会发现:通过任意一种方式修改了静态变量的值以后,
        * 其他任何方式查看都是修改后的值*/
        Fruit f = new Fruit();
        f.clean();
        Fruit.kind="ss";
        Fruit.grow();
        f.grow();
        System.out.println(f.kind);
    }
}
/*被static修饰的资源,称作是静态资源
* 静态资源是随着类加载而加载到内存中的,比对象优先进入内存
* 所以静态资源可以通过类名直接调用,即使没有创建对象,也可以调用*/
class Fruit {
    /*1.可以用static修饰属性吗?可以*/
    static String kind;//种类
    double weight;//重量

    public void clean() {
        System.out.println("洗水果呀洗水果~");
    }
    public static void grow() {
        System.out.println("这个果子长得真好吃~");
    }
}
