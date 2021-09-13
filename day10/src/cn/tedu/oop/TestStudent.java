package cn.tedu.oop;
/*本类用作学生类的测试类*/
public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("林冲");
        s.setGender('男');
        s.setSubject("CGB");
        s.setAddress("庙里");
        s.study();
        s.eat(3);
        System.out.println(s.sleep());
        s.show();

        Student s2 = new Student(2,"李逵",'男',"ACT","猪肉铺");
        s2.study();
        s2.eat(10);
        System.out.println(s2.sleep());
        s2.show();
    }
}
