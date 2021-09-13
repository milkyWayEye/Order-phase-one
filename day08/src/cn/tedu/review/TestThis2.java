package cn.tedu.review;
/*本类用于复习this的第2个功能*/
public class TestThis2 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}

class Dog {
    public Dog() {
        this(666);
        System.out.println("无参构造");
    }
    public Dog(int n) {
        System.out.println("含参构造"+n);
    }
}
