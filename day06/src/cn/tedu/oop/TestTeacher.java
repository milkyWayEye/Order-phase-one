package cn.tedu.oop;

/**
 * 本类用于练习面向对象2
 */
public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setSubject("CGB");
        t1.setName("泡泡");
        Teacher t2 = new Teacher();
        t2.setNo(13089);
        t2.setDept("Java教研二部");
        Teacher t3 = new Teacher();
        t3.setName("涛涛");
        t3.setNo(10086);
        t3.setDept("Java教研一部");
        t3.setSubject("SCD");

    }
}

class Teacher {
    private String name;
    private int no;
    private String dept;
    private String subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String  dept) {
        this.dept = dept;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void ready() {
        System.out.println("正在备课中");
    }

    public void teach() {
        System.out.println("正在授课中");
    }
}