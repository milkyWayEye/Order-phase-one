package cn.tedu.review;
/*本类用作暴力反射的物料类*/
public class Person {
    //1.提供私有属性
    private String name;
    private int age;

    private void save(int n, String s) {
        System.out.println("save()..."+n+s);
    }
    private void update() {
        System.out.println("update()...");
    }
}
