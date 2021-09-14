package cn.tedu.review;

public class Teacher implements Person{
    @Override
    public void eat() {
        System.out.println("老师在学校食堂吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("老师在学校公寓住宿");
    }
}
