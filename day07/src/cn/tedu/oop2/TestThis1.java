package cn.tedu.oop2;
/*本类用于this关键字的学习*/
public class TestThis1 {
    public static void main(String[] args) {
        /*1.变量有一个就近原则:离谁近,使用谁*/
        /*2.当局部变量于成员变量同名时,可以使用this关键字指定本类的成员变量*/
    }
}


class Pig {
    int sum = 20;

    public void eat() {
        int a = 5;
        System.out.println(a);
        System.out.println(sum);
    }
}