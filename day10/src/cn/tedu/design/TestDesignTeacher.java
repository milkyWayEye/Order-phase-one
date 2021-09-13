package cn.tedu.design;
/*本类用于老师设计案例的测试类*/
public class TestDesignTeacher {
    public static void main(String[] args) {
        CGBTeacher c = new CGBTeacher();
        c.teach();
        c.ready();
        Teacher t = new CGBTeacher();
        c.ready();
        c.teach();
    }
}
