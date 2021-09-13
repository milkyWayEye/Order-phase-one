package cn.tedu.review;

public class TestThis {
}

class Car {
    int sum = 100;
    int count = 999;

    public void run() {
        int sum = 10;
        int b = 99;
        System.out.println(this.sum);//100,如果成员变量与局部变量重名,用this指定成员变量
        System.out.println(sum);//10
        System.out.println(count);//999
        System.out.println(b);//99
    }
}
