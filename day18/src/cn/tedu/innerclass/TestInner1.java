package cn.tedu.innerclass;
/*本类用作内部类的入门案例*/
public class TestInner1 {
    public static void main(String[] args) {
        //3.1创建内部类的对象,使用外部类的资源
        /*外部类名.内部类名 对象名=外部类对象.内部类对象*/
        Outer.Inner oi = new Outer().new Inner();
        //3.2通过创建好的内部类对象,使用内部类的资源
        oi.delete();
        System.out.println(oi.sum);
        //3.3外部想要使用外部类的资源,需要通过外部类的对象
        new Outer().play();
    }
}

//1.创建外部类
class Outer{
    //1.1 创建外部类的成员变量
    String name;
    private int age;
    //1.2 创建外部类的成员方法
    public void play() {
        System.out.println("Outer...play()");
        //5.测试外部类是否能使用内部类的资源
        //delete();//不能直接查看内部类的方法
        //System.out.println(sum);//不能直接查看内部类的属性
        /*外部类如果想要使用内部类的资源,必须先创建内部类的对象
        * 通过内部类对象调用内部类的功能*/
        Inner in = new Inner();//直接创建内部类对象,无需指定外部类,已经在外部类里了
        System.out.println(in.sum);//通过内部类对象查看内部类的属性
        in.delete();//通过内部类对象调用内部类的方法
    }
    //2.创建内部类--被看作是外部类的一个特殊成员
    class Inner{
        //2.1 定义内部类的成员变量
        int sum=10;
        //2.2 定义内部类的成员方法
        public void delete() {
            System.out.println("Inner...delete()");
            //测试内部类能否使用外部类的资源
            System.out.println(name);//可以查看外部类的普通属性
            System.out.println(age);//可以查看外部类的私有属性
        }
    }
}