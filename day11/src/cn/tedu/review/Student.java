package cn.tedu.review;

public class Student implements Person{
    @Override
    public void eat() {
        System.out.println("学生在食堂吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生在宿舍住宿");
    }
}
