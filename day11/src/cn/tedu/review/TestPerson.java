package cn.tedu.review;
/*本类用来测试学校开招待所案例*/
public class TestPerson {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        Parents p = new Parents();
        t.eat();
        t.sleep();
        s.eat();
        s.sleep();
        p.eat();
        p.sleep();
    }
}
