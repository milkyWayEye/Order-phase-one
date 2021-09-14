package cn.tedu.review;

public class Parents implements Person{
    @Override
    public void eat() {
        System.out.println("家长在招待所的饭馆吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("家长回招待所休息");
    }
}
