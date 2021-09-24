package cn.tedu.innerclass;
/*本类用于测试成员内部类能否被private修饰*/
public class TestInner2 {
    public static void main(String[] args) {
        //4.创建内部类对象使用内部类的资源
        //Outer2.Inner2 oi = new Outer2().new Inner2();
        /*2.如果成员内部类被private修饰,外部无法直接访问或创建内部类的对象*/
        //间接访问,虽然创建不了私有内部类的对象,到那时可以创建外部类的对象
        new Outer2().getInner2Eat();
    }
}

//1.创建外部类
class Outer2{
    //6.提供一个公共的方法,在方法内部创建内部类Inner2的对象,调用内部类的功能
    public void getInner2Eat() {
        Inner2 in = new Inner2();//可以在外部类里创建私有成员内部类的对象
        in.eat();//通过创建好的内部类对象调用内部类的方法
    }
    /*成员内部类的位置:类里方法外*/
    //2.1 创建成员内部类Inner2
    //5.用private修饰成员内部类
    private class Inner2{
        //3.创建成员内部类的普通方法
        public void eat(){
            System.out.println("Inner2...eat()");
        }
    }
}