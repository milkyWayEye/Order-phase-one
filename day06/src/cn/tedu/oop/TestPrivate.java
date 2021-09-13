package cn.tedu.oop;
/**本类用于测试面向对象第一大特性--封装*/
public class TestPrivate {
    public static void main(String[] args) {
        Student s = new Student();
        Aa w = new TestPrivate().new Aa();
        System.out.println(w.name);
        Aa.Bb r = new TestPrivate().new Aa().new Bb();
        System.out.println(r.mm);
    }
    private class Aa {
        int name = 2;
        private class Bb {
            int mm = 4;
        }
    }
}

//1.描述学生这一类型 特征: 学号 姓名 科目 功能:学习 吃饭 睡觉
class Student {
    private int sno;
    private String name;
    private String subject;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void study() {
        System.out.println("正在学习中");
    }
    public void eat() {
        System.out.println("正在吃饭");
    }
    public void sleep() {
        System.out.println("我一点也不想睡觉,就想学java");
    }
}